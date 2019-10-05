package eu.lidovydum.riddle4j;

import eu.lidovydum.riddle4j.becky.Becky;
import eu.lidovydum.riddle4j.becky.BeckySituace;
import eu.lidovydum.riddle4j.kozavlkzeli.KozaVlkZeli;
import eu.lidovydum.riddle4j.kozavlkzeli.RekaSituace;
import eu.lidovydum.riddle4j.lib.Visualiser;

import java.util.List;


public class Application {

    public static void main(String[] args) {
        becky();
        koza();
    }

    private static void koza() {
        System.out.println("___Koza___\n");
        KozaVlkZeli kozaVlkZeli = new KozaVlkZeli();
        List<RekaSituace> found = kozaVlkZeli.solve();
        for (RekaSituace situation : found) {
            Visualiser<RekaSituace> visualiser = new Visualiser<RekaSituace>();
            System.out.println(visualiser.visualise(situation));
        }
        System.out.println();
    }

    private static void becky() {
        System.out.println("___BEČKY___\n");
        Becky becky = new Becky();
        List<BeckySituace> found = becky.solve();
        for (BeckySituace situation : found) {
            Visualiser<BeckySituace> visualiser = new Visualiser<BeckySituace>();
            System.out.println(visualiser.visualise(situation));
        }
        System.out.println();
    }
}
