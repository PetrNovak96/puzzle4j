package eu.lidovydum.riddle4j.impl.rules;

import eu.lidovydum.riddle4j.impl.RekaSituace;
import eu.lidovydum.riddle4j.lib.Move;
import eu.lidovydum.riddle4j.lib.Rule;

public class KozaVlk implements Rule<RekaSituace> {


    public boolean suitsRule(RekaSituace staraSituace, Move move) {
        RekaSituace novaSituace = (RekaSituace) move.apply(staraSituace);
        //System.out.print("\nnová situace:\n"+novaSituace);
        boolean vyhovuje = !(novaSituace.getKoza().equals(novaSituace.getVlk()) && !novaSituace.getKoza().equals(novaSituace.getSedlak()));
        //System.out.print("\nvyhovuje:\n"+ vyhovuje);
        //System.out.println();
        return vyhovuje;
    }
}
