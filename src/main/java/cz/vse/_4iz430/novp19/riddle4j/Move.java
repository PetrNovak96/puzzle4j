package cz.vse._4iz430.novp19.riddle4j.lib;

public interface Move<T extends Situation> {

    public T apply(T situation);
}

