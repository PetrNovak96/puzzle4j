package eu.lidovydum.riddle4j;

import eu.lidovydum.riddle4j.becky.Becky;
import eu.lidovydum.riddle4j.kozavlkzeli.KozaVlkZeli;
import eu.lidovydum.riddle4j.kozavlkzeli.RekaSituace;
import eu.lidovydum.riddle4j.lib.Situation;

import java.util.List;


public class Application {

    public static void main(String[] args) {
        becky();
    }

    private static void becky() {
        Becky becky = new Becky();
        List<Situation> found = becky.solve();
        for (Situation situation : found) {
            System.out.println(situation);
            Situation previous = situation.getPrevious();
            while(previous != null) {
                System.out.println(previous);
                previous = previous.getPrevious();
            }
        }
    }

    private static void koza() {
        KozaVlkZeli kozaVlkZeli = new KozaVlkZeli();
        List<Situation> found = kozaVlkZeli.solve();
        for (Situation situation : found) {
            System.out.println(situation);
            RekaSituace rekaSituace = (RekaSituace) situation.getPrevious();
            while(rekaSituace != null) {
                System.out.println(rekaSituace);
                rekaSituace = (RekaSituace) rekaSituace.getPrevious();
            }
        }
    }
}
