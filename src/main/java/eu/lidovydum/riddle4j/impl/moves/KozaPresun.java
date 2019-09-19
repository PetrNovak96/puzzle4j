package eu.lidovydum.riddle4j.impl.moves;

import eu.lidovydum.riddle4j.impl.RekaSituace;

public class KozaPresun extends Presun {

    public RekaSituace apply(RekaSituace situace) {
        return new RekaSituace(
                this.zmenBreh(situace.getSedlak()),
                this.zmenBreh(situace.getKoza()),
                situace.getZeli(),
                situace.getVlk()
        );
    }
}
