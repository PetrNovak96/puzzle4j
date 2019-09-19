package eu.lidovydum.riddle4j.lib;

public interface Move<T extends Situation> {

    public T apply(T situation);
}

