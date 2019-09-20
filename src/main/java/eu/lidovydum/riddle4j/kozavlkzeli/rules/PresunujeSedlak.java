package eu.lidovydum.riddle4j.kozavlkzeli.rules;

import eu.lidovydum.riddle4j.kozavlkzeli.RekaSituace;
import eu.lidovydum.riddle4j.lib.Move;
import eu.lidovydum.riddle4j.lib.Rule;

public class PresunujeSedlak implements Rule<RekaSituace> {

    public boolean suitsRule(RekaSituace staraSituace, Move move) {
        String starySedlak = staraSituace.getSedlak();
        RekaSituace novaSituace = (RekaSituace) move.apply(staraSituace);
        String novySedlak = novaSituace.getSedlak();
        boolean vyhovuje = jeValidniPozice(staraSituace.getSedlak(),novaSituace.getSedlak(),starySedlak,novySedlak)
                && jeValidniPozice(staraSituace.getKoza(),novaSituace.getKoza(),starySedlak,novySedlak)
                && jeValidniPozice(staraSituace.getVlk(),novaSituace.getVlk(),starySedlak,novySedlak)
                && jeValidniPozice(staraSituace.getZeli(),novaSituace.getZeli(),starySedlak,novySedlak);
        return vyhovuje;
    }

    private boolean jeValidniPozice(String stara, String nova, String starySedlak, String novySedlak) {
        if (!stara.equals(nova) && !stara.equals(starySedlak) && !nova.equals(novySedlak)) {
            return false;
        }
        return true;
    }
}
