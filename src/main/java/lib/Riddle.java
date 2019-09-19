package lib;

public abstract class Riddle {

    private Situation initialSituation;
    private Iterable<Situation> successSituations;
    private Iterable<Move> moves;
    private Iterable<Rule> rules;

    public Riddle(Situation initialSituation,
                  Iterable<Situation> successSituations,
                  Iterable<Move> moves,
                  Iterable<Rule> rules) {
        this.initialSituation = initialSituation;
        this.successSituations = successSituations;
        this.moves = moves;
        this.rules = rules;
    }

    public Iterable<Situation> findFollowing(Situation situation) {
        //TODO find following situations
        return null;
    }

    public void init() {
        //TODO init reseni
    }

    public Situation getInitialSituation() {
        return initialSituation;
    }

    public void setInitialSituation(Situation initialSituation) {
        this.initialSituation = initialSituation;
    }

    public Iterable<Situation> getSuccessSituations() {
        return successSituations;
    }

    public void setSuccessSituations(Iterable<Situation> successSituations) {
        this.successSituations = successSituations;
    }

    public Iterable<Move> getMoves() {
        return moves;
    }

    public void setMoves(Iterable<Move> moves) {
        this.moves = moves;
    }

    public Iterable<Rule> getRules() {
        return rules;
    }

    public void setRules(Iterable<Rule> rules) {
        this.rules = rules;
    }
}
