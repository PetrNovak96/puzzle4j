package eu.lidovydum.riddle4j.becky.moves;

import eu.lidovydum.riddle4j.becky.BeckySituace;
import eu.lidovydum.riddle4j.lib.Move;

public class Preliti implements Move<BeckySituace> {

    private int zdroj;
    private int cil;

    public Preliti(int zdroj, int cil) {
        this.zdroj = zdroj;
        this.cil = cil;
    }

    public BeckySituace apply(BeckySituace situace) {
        int[] stareBecky = situace.getBecky();
        int prijme = situace.getLimity()[cil] - stareBecky[cil];
        int muzeDat = stareBecky[zdroj];
        int obsah = Math.min(muzeDat, prijme);
        int[] noveBecky = {stareBecky[0], stareBecky[1], stareBecky[2]};
        noveBecky[zdroj] = noveBecky[zdroj] - obsah;
        noveBecky[cil] = noveBecky[cil] + obsah;
        BeckySituace novaSituace = new BeckySituace();
        novaSituace.setBecky(noveBecky);
        return novaSituace;
    }
}
