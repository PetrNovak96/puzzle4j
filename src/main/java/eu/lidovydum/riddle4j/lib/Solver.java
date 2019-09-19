package eu.lidovydum.riddle4j.lib;

import java.util.ArrayList;
import java.util.List;

//adept na abstrakci
class Solver<T extends Situation>{

    private List<T> open = new ArrayList<T>();
    private List<T> closed = new ArrayList<T>();
    private Iterable<Move> moves;
    private Iterable<Rule> rules;
    private T current;
    private boolean success;

    List<T> solve(T initialSituation,
               Iterable<T> successSituations,
               Iterable<Move> moves,
               Iterable<Rule> rules) {
        this.moves = moves;
        this.rules = rules;
        this.closed.add(initialSituation);
        this.success = false;
        List<T> foundSituations = new ArrayList<T>();

        while(!this.success) {
            if (this.closed.isEmpty()) {
                System.out.println("is empty");
                break;
            } else {
                this.current = this.closed.remove(0);
                // uloží na konec
                this.closed.addAll(this.open(current));
                for (T situation : this.closed) {
                    boolean isGoal = false;
                    for(T successSituation: successSituations) {
                        if (situation.isEqual(successSituation)) {
                            isGoal = true;
                            break;
                        }
                    }
                    if (isGoal) {
                        foundSituations.add(situation);
                        this.success = true;
                    }
                }
            }
        }
        return foundSituations;
    }

    private List<T> open(T situation) {
        List<T> situations = new ArrayList<T>();
        for (Move move: this.moves) {
            boolean added = false;
            for (Rule rule: this.rules) {
                if (rule.suitsRule(situation, move)) {
                    T newSituation = (T) move.apply(situation);
                    newSituation.setPrevious(situation);
                    situation.addFollowing(newSituation);
                    if(!added) {
                        situations.add((T) move.apply(situation));
                        added = true;
                    }
                }
            }
        }
        System.out.println(situations.size());
        return situations;
    }
}
