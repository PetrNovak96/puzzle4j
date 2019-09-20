package eu.lidovydum.riddle4j.kozavlkzeli.moves;

import eu.lidovydum.riddle4j.kozavlkzeli.RekaSituace;

public class ZeliPresun extends Presun {

    public RekaSituace apply(RekaSituace situace) {
        return new RekaSituace(
                this.zmenBreh(situace.getSedlak()),
                situace.getKoza(),
                this.zmenBreh(situace.getZeli()),
                situace.getVlk()
        );
    }
}
