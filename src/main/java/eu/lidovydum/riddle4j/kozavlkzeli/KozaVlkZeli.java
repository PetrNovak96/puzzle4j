package eu.lidovydum.riddle4j.kozavlkzeli;

import eu.lidovydum.riddle4j.lib.Riddle;

public class KozaVlkZeli extends Riddle<RekaSituace> {

    protected RekaSituace initialSituation() {
        return new RekaSituace("L", "L", "L", "L");
    }
}
