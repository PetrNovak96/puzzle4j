package cz.vse._4iz430.novp19.riddle4j;

public interface Rule<T extends Situation> {

    public boolean suitsRule(T situation, Move move);
}
