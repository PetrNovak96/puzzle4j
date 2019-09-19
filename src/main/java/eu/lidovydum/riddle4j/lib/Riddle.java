package eu.lidovydum.riddle4j.lib;


import eu.lidovydum.riddle4j.impl.MySituation;

public abstract class Riddle<T extends Situation> {

    private Situation initialSituation;
    private Iterable<? extends Situation> successSituations;
    private Iterable<Move> moves;
    private Iterable<Rule> rules;
    private Solver solver;

    public Riddle() {
        this.solver = new Solver<T>();
        this.initialSituation = initialSituation();
        this.successSituations = successSituations();
        this.moves = Reflection.getMoves();
        this.rules = Reflection.getRules();
    }

    public Iterable<Situation> findFollowing(Situation situation) {
        //TODO find following situations
        return null;
    }

    public void solve() {
        this.solver.solve(initialSituation, successSituations, moves, rules);
    }

    protected abstract Situation initialSituation();
    protected abstract Iterable<? extends Situation> successSituations();
}
