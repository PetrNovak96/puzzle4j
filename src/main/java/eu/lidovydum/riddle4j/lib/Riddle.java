package eu.lidovydum.riddle4j.lib;


import java.util.List;
import java.util.Set;

public abstract class Riddle<T extends Situation> {

    private T initialSituation;
    private Set<Move> moves;
    private Set<Rule> rules;
    private Solver<T> solver;
    private Reflection<T> reflection;

    public Riddle() {
        this.solver = new Solver<T>();
        this.reflection = new Reflection<T>();
        this.initialSituation = initialSituation();
        this.rules = this.reflection.getRules();
        this.moves = this.reflection.getMoves();
    }

    public List<Situation> solve() {
        return (List<Situation>) this.solver.solve(initialSituation, moves, rules);
    }

    protected abstract T initialSituation();
}
