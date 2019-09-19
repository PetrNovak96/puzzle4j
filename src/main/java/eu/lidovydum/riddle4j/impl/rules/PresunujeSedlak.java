package eu.lidovydum.riddle4j.impl.rules;

import eu.lidovydum.riddle4j.impl.RekaSituace;
import eu.lidovydum.riddle4j.lib.Move;
import eu.lidovydum.riddle4j.lib.Rule;

public class PresunujeSedlak implements Rule<RekaSituace> {

    public boolean suitsRule(RekaSituace staraSituace, Move move) {
        String starySedlak = staraSituace.getSedlak();
        RekaSituace novaSituace = (RekaSituace) move.apply(staraSituace);
        return jeValidniPozice(staraSituace.getSedlak(),novaSituace.getSedlak(),starySedlak)
                && jeValidniPozice(staraSituace.getKoza(),novaSituace.getKoza(),starySedlak)
                && jeValidniPozice(staraSituace.getVlk(),novaSituace.getVlk(),starySedlak)
                && jeValidniPozice(staraSituace.getZeli(),novaSituace.getZeli(),starySedlak);

    }

    private boolean jeValidniPozice(String stara, String nova, String starySedlak) {
        return stara.equals(nova) || stara.equals(starySedlak);
    }
}
