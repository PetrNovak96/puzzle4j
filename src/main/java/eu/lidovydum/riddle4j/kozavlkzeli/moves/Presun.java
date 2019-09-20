package eu.lidovydum.riddle4j.kozavlkzeli.moves;

import eu.lidovydum.riddle4j.kozavlkzeli.RekaSituace;
import eu.lidovydum.riddle4j.lib.Move;

public abstract class Presun implements Move<RekaSituace> {

    protected String zmenBreh(String soucasnyBreh) {
        return (soucasnyBreh.equals("L"))? "P" : "L";
    }
}
