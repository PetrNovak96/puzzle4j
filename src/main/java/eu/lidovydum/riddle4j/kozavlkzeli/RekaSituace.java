package eu.lidovydum.riddle4j.kozavlkzeli;

import eu.lidovydum.riddle4j.lib.Situation;

public class RekaSituace extends Situation {

    private String sedlak;
    private String koza;
    private String zeli;
    private String vlk;

    public RekaSituace(String sedlak, String koza, String zeli, String vlk) {
        this.sedlak = sedlak;
        this.koza = koza;
        this.zeli = zeli;
        this.vlk = vlk;
    }

    public boolean isEqual(Situation situation) {
        RekaSituace situace = (RekaSituace) situation;
        return this.koza.equals(situace.koza) && this.sedlak.equals(situace.sedlak) && this.zeli.equals(situace.zeli) && this.vlk.equals(situace.vlk);
    }

    public boolean isGoalSituation() {
        return this.koza.equals("P") && this.sedlak.equals("P") && this.zeli.equals("P") && this.vlk.equals("P");
    }

    public String getSedlak() {
        return sedlak;
    }

    public void setSedlak(String sedlak) {
        this.sedlak = sedlak;
    }

    public String getKoza() {
        return koza;
    }

    public void setKoza(String koza) {
        this.koza = koza;
    }

    public String getZeli() {
        return zeli;
    }

    public void setZeli(String zeli) {
        this.zeli = zeli;
    }

    public String getVlk() {
        return vlk;
    }

    public void setVlk(String vlk) {
        this.vlk = vlk;
    }

    @Override
    public String toString() {
        return "sedlak: " + sedlak + " koza: " + koza + " vlk: " + vlk + " zeli: " + zeli;
    }
}
