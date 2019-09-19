package lib;

public interface Move<T extends Situation> {

    public T apply(T situation);
}

