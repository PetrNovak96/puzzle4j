package eu.lidovydum.riddle4j.impl.rules;

import eu.lidovydum.riddle4j.impl.MySituation;
import eu.lidovydum.riddle4j.lib.Move;
import eu.lidovydum.riddle4j.lib.Rule;

public class MyRule implements Rule<MySituation> {

    public boolean suitsRule(MySituation situation, Move<MySituation> move) {
        return false;
    }
}
