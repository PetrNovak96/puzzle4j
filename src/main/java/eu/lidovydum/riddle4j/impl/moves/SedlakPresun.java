package eu.lidovydum.riddle4j.impl.moves;

import eu.lidovydum.riddle4j.impl.RekaSituace;
import eu.lidovydum.riddle4j.lib.Move;

public class SedlakPresun extends Presun {

    public RekaSituace apply(RekaSituace situace) {
        return new RekaSituace(
                this.zmenBreh(situace.getSedlak()),
                situace.getKoza(),
                situace.getZeli(),
                situace.getVlk()
        );
    }
}
