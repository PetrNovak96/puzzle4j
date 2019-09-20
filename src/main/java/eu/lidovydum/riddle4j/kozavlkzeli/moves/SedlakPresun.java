package eu.lidovydum.riddle4j.kozavlkzeli.moves;

import eu.lidovydum.riddle4j.kozavlkzeli.RekaSituace;

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