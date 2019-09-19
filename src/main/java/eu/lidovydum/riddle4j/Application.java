package eu.lidovydum.riddle4j;

import eu.lidovydum.riddle4j.impl.KozaVlkZeli;
import eu.lidovydum.riddle4j.impl.RekaSituace;
import eu.lidovydum.riddle4j.lib.Situation;

import java.util.List;


public class Application {

    public static void main(String[] args) {
        KozaVlkZeli kozaVlkZeli = new KozaVlkZeli();
        List<Situation> found = kozaVlkZeli.solve();
        for (Situation situation : found) {
            RekaSituace rekaSituace = (RekaSituace) situation;
            System.out.println(rekaSituace.getZeli());
            System.out.println(rekaSituace.getSedlak());
            System.out.println(rekaSituace.getKoza());
            System.out.println(rekaSituace.getVlk());
        }
    }
}
