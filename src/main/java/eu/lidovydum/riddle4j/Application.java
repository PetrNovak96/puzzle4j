package eu.lidovydum.riddle4j;

import eu.lidovydum.riddle4j.becky.Becky;
import eu.lidovydum.riddle4j.kozavlkzeli.KozaVlkZeli;
import eu.lidovydum.riddle4j.kozavlkzeli.RekaSituace;
import eu.lidovydum.riddle4j.lib.Situation;

import java.util.List;


public class Application {

    public static void main(String[] args) {
        becky();
        koza();
    }

    private static void becky() {
        System.out.println("___BEČKY___\n");
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
        System.out.println();
    }

    private static void koza() {
        System.out.println("___KOZA VLK ZELI___\n");
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
        System.out.println();
    }
}
