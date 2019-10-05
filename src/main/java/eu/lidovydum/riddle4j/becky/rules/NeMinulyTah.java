package eu.lidovydum.riddle4j.becky.rules;

import eu.lidovydum.riddle4j.becky.BeckySituace;
import eu.lidovydum.riddle4j.lib.Move;
import eu.lidovydum.riddle4j.lib.Rule;
import eu.lidovydum.riddle4j.lib.Situation;

public class NeMinulyTah implements Rule<BeckySituace> {

    public boolean suitsRule(BeckySituace situation, Move move) {
        Situation minula = situation.getPrevious();
        return (minula == null) || !(minula.equals(move.apply(situation)));
    }
}
