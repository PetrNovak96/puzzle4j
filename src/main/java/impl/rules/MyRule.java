package impl.rules;

import impl.MySituation;
import lib.Move;
import lib.Rule;

public class MyRule implements Rule<MySituation> {


    public boolean suitsRule(MySituation situation, Move<MySituation> move) {
        return false;
    }
}
