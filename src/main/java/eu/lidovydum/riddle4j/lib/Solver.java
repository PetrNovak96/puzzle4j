package eu.lidovydum.riddle4j.lib;

import java.util.ArrayList;
import java.util.List;

//adept na abstrakci
class Solver<T extends Situation>{

    private List<T> open = new ArrayList<T>();
    private List<T> closed = new ArrayList<T>();
    private Iterable<Move<T>> moves;
    private Iterable<Rule<T>> rules;
    private T current;
    private boolean success;

    void solve(T initialSituation,
               Iterable<T> successSituations,
               Iterable<Move<T>> moves,
               Iterable<Rule<T>> rules) {
        this.moves = moves;
        this.closed.add(initialSituation);
        this.success = false;

        while(!this.success) {
            if (this.closed.isEmpty()) {
                this.success = false;
                break;
            } else {
                this.current = this.closed.get(0);
                // uloží na konec
                this.closed.addAll(this.open(current));
                for (T situation : this.closed) {
                    //TODO algoritmus není správně
                    for(T successSituation: successSituations) {
                        if (situation.isEqual(successSituation)) {
                            this.success = true;
                            break;
                        }
                    }
                }
            }
        }
    }

    private List<T> open(T situation) {
        List<T> situations = new ArrayList<T>();
        for (Move<T> move: this.moves) {
            for (Rule<T> rule: this.rules) {
                if (rule.suitsRule(situation, move)) {
                    T newSituation = move.apply(situation);
                    newSituation.setPrevious(situation);
                    situation.addFollowing(newSituation);
                    situations.add(move.apply(situation));
                }
            }
        }
        return situations;
    }
}
