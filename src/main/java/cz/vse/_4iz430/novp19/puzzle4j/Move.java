package cz.vse._4iz430.novp19.puzzle4j;

public interface Move<T extends Situation> {

    public T apply(T situation);
}

