package eu.lidovydum.riddle4j.impl;

import eu.lidovydum.riddle4j.lib.Riddle;

import java.util.ArrayList;
import java.util.List;

public class KozaVlkZeli extends Riddle<RekaSituace> {

    protected RekaSituace initialSituation() {
        return new RekaSituace("L", "L", "L", "L");
    }

    protected Iterable<RekaSituace> successSituations() {
        List<RekaSituace> cil = new ArrayList<RekaSituace>();
        cil.add(new RekaSituace("P", "P", "P", "P"));
        return cil;
    }
}
