package eu.lidovydum.riddle4j.impl.rules;

import eu.lidovydum.riddle4j.impl.RekaSituace;
import eu.lidovydum.riddle4j.lib.Move;
import eu.lidovydum.riddle4j.lib.Rule;

public class PresunujeSedlak implements Rule<RekaSituace> {

    public boolean suitsRule(RekaSituace staraSituace, Move move) {
        System.out.println();
        System.out.print("stará situace:\n"+staraSituace);
        String starySedlak = staraSituace.getSedlak();
        RekaSituace novaSituace = (RekaSituace) move.apply(staraSituace);
        String novySedlak = novaSituace.getSedlak();
        System.out.print("\nnová situace:\n"+novaSituace);
        boolean vyhovuje = jeValidniPozice(staraSituace.getSedlak(),novaSituace.getSedlak(),starySedlak,novySedlak)
                && jeValidniPozice(staraSituace.getKoza(),novaSituace.getKoza(),starySedlak,novySedlak)
                && jeValidniPozice(staraSituace.getVlk(),novaSituace.getVlk(),starySedlak,novySedlak)
                && jeValidniPozice(staraSituace.getZeli(),novaSituace.getZeli(),starySedlak,novySedlak);
        System.out.print("\nvyhovuje:\n"+ vyhovuje);
        System.out.println();
        return vyhovuje;
    }

    private boolean jeValidniPozice(String stara, String nova, String starySedlak, String novySedlak) {
        if (!stara.equals(nova) && !nova.equals(novySedlak)) {
            return false;
        }
        return true;
    }
}
