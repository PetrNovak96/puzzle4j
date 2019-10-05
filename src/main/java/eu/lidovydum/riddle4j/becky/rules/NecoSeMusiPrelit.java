package eu.lidovydum.riddle4j.becky.rules;

import eu.lidovydum.riddle4j.becky.BeckySituace;
import eu.lidovydum.riddle4j.lib.Move;
import eu.lidovydum.riddle4j.lib.Rule;

public class NecoSeMusiPrelit implements Rule<BeckySituace> {


    public boolean suitsRule(BeckySituace situation, Move move) {
        return !(situation.equals(move.apply(situation)));
    }
}
