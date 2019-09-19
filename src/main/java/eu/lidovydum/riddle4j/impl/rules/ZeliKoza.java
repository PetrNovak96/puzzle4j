package eu.lidovydum.riddle4j.impl.rules;

import eu.lidovydum.riddle4j.impl.RekaSituace;
import eu.lidovydum.riddle4j.lib.Move;
import eu.lidovydum.riddle4j.lib.Rule;

public class ZeliKoza implements Rule<RekaSituace> {
    public boolean suitsRule(RekaSituace staraSituace, Move move) {
        RekaSituace novaSituace = (RekaSituace) move.apply(staraSituace);
        return !(novaSituace.getKoza().equals(novaSituace.getZeli()) && !novaSituace.getKoza().equals(novaSituace.getSedlak()));
    }
}
