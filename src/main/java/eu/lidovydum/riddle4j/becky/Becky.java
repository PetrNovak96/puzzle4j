package eu.lidovydum.riddle4j.becky;

import eu.lidovydum.riddle4j.lib.Riddle;

public class Becky extends Riddle<BeckySituace> {


    protected BeckySituace initialSituation() {
        BeckySituace situace = new BeckySituace();
        situace.setBecky(new int[]{8, 0, 0});
        return situace;
    }
}
