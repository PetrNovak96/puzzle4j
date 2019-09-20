package eu.lidovydum.riddle4j.becky;

import eu.lidovydum.riddle4j.becky.moves.Preleti;
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
        set.add(new Preleti(0,1));
        set.add(new Preleti(0,2));
        set.add(new Preleti(1,0));
        set.add(new Preleti(1,2));
        set.add(new Preleti(2,1));
        set.add(new Preleti(2,0));
        return set;
    }

    protected Set<Rule> rules() {
        return new HashSet<Rule>();
    }
}
