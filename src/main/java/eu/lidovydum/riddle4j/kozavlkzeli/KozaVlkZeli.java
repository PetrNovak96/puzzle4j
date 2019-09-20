package eu.lidovydum.riddle4j.kozavlkzeli;

import eu.lidovydum.riddle4j.kozavlkzeli.moves.KozaPresun;
import eu.lidovydum.riddle4j.kozavlkzeli.moves.SedlakPresun;
import eu.lidovydum.riddle4j.kozavlkzeli.moves.VlkPresun;
import eu.lidovydum.riddle4j.kozavlkzeli.moves.ZeliPresun;
import eu.lidovydum.riddle4j.kozavlkzeli.rules.KozaVlk;
import eu.lidovydum.riddle4j.kozavlkzeli.rules.PresunujeSedlak;
import eu.lidovydum.riddle4j.kozavlkzeli.rules.ZeliKoza;
import eu.lidovydum.riddle4j.lib.Move;
import eu.lidovydum.riddle4j.lib.Riddle;
import eu.lidovydum.riddle4j.lib.Rule;

import java.util.HashSet;
import java.util.Set;

public class KozaVlkZeli extends Riddle<RekaSituace> {

    protected RekaSituace initialSituation() {
        return new RekaSituace("L", "L", "L", "L");
    }

    protected Set<Move> moves() {
        Set<Move> set = new HashSet<Move>();
        set.add(new KozaPresun());
        set.add(new SedlakPresun());
        set.add(new VlkPresun());
        set.add(new ZeliPresun());
        return set;
    }

    protected Set<Rule> rules() {
        Set<Rule> set = new HashSet<Rule>();
        set.add(new KozaVlk());
        set.add(new ZeliKoza());
        set.add(new PresunujeSedlak());
        return set;
    }
}
