package eu.lidovydum.riddle4j.impl.moves;

import eu.lidovydum.riddle4j.impl.RekaSituace;
import eu.lidovydum.riddle4j.lib.Move;

public abstract class Presun implements Move<RekaSituace> {

    protected String zmenBreh(String soucasnyBreh) {
        return (soucasnyBreh.equals("L"))? "P" : "L";
    }
}
