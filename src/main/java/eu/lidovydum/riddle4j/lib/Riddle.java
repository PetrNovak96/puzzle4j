package eu.lidovydum.riddle4j.lib;

public abstract class Riddle {

    private Situation initialSituation;
    private Iterable<? extends Situation> successSituations;
    private Iterable<Move> moves;
    private Iterable<Rule> rules;

    public Riddle() {
        this.initialSituation = initialSituation();
        this.successSituations = successSituations();
        this.moves = Reflection.getMoves();
        this.rules = Reflection.getRules();
    }

    public Iterable<Situation> findFollowing(Situation situation) {
        //TODO find following situations
        return null;
    }

    public void init() {
        //TODO init reseni
    }

    protected abstract Situation initialSituation();
    protected abstract Iterable<? extends Situation> successSituations();
}
