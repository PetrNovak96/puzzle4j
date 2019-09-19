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

            RekaSituace rekaSituace = (RekaSituace) situation.getPrevious();
            while(rekaSituace != null) {
                System.out.println(rekaSituace);
                rekaSituace = (RekaSituace) rekaSituace.getPrevious();
            }
        }
    }
}
