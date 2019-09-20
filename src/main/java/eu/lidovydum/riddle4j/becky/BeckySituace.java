package eu.lidovydum.riddle4j.becky;

import eu.lidovydum.riddle4j.lib.Situation;

public class BeckySituace extends Situation {

    private int[] becky = new int[3];
    private int[] limity = {8, 5, 3};

    public boolean isEqual(Situation situation) {
        BeckySituace situace = (BeckySituace) situation;
        return situace.becky[0] == this.becky[0]
                && situace.becky[1] == this.becky[1]
                && situace.becky[2] == this.becky[2];
    }

    public boolean isGoalSituation() {
        return becky[0] == 4 || becky[1] == 4 || becky[2] == 4;
    }

    public int[] getBecky() {
        return becky;
    }

    public void setBecky(int[] becky) {
        this.becky = becky;
    }

    public int[] getLimity() {
        return limity;
    }

    @Override
    public String toString() {
        return becky[0] + " " + becky[1] + " " + becky[2];
    }
}
