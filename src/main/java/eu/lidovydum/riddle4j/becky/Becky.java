package eu.lidovydum.riddle4j.becky;

import eu.lidovydum.riddle4j.becky.moves.Preliti;
import eu.lidovydum.riddle4j.becky.rules.NeMinulyTah;
import eu.lidovydum.riddle4j.becky.rules.NecoSeMusiPrelit;
import eu.lidovydum.riddle4j.lib.Move;
import eu.lidovydum.riddle4j.lib.Riddle;
import eu.lidovydum.riddle4j.lib.Rule;

import java.util.HashSet;
import java.util.Set;

public class Becky extends Riddle<BeckySituace> {
    protected BeckySituace initialSituation() {
        BeckySituace situace = new BeckySituace();
        situace.setBecky(new int[]{8, 0, 0});
        return situace;
    }
    protected Set<Move> moves() {
        Set<Move> set = new HashSet<Move>();
        set.add(new Preliti(0,1));
        set.add(new Preliti(0,2));
        set.add(new Preliti(1,0));
        set.add(new Preliti(1,2));
        set.add(new Preliti(2,1));
        set.add(new Preliti(2,0));
        return set;
    }
    protected Set<Rule> rules() {
        Set<Rule> set = new HashSet<Rule>();
        set.add(new NecoSeMusiPrelit());
        set.add(new NeMinulyTah());
        return set;
    }
}
