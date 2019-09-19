package lib;

public interface Rule<T extends Situation> {

    public boolean suitsRule(T situation, Move<T> move);
}
