package cz.vse._4iz430.novp19.puzzle4j;


import java.util.List;
import java.util.Set;

public abstract class Puzzle<T extends Situation> {

    private T initialSituation;
    private Set<Move> moves;
    private Set<Rule> rules;
    private Solver<T> solver;

    public Puzzle() {
        this.solver = new Solver<T>();
        this.initialSituation = initialSituation();
        this.rules = this.rules();
        this.moves = this.moves();
    }

    public List<T> solve() {
        return this.solver.solve(initialSituation, moves, rules);
    }

    protected abstract T initialSituation();

    protected abstract Set<Move> moves();
    protected abstract Set<Rule> rules();
}
