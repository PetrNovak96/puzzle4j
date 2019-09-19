package eu.lidovydum.riddle4j.lib;

public abstract class Situation {

    private Situation previous;
    private Iterable<Situation> following;

    public Situation() {
        Class<? extends Situation> child = this.getClass();
    }

    public Situation getPrevious() {
        return previous;
    }

    public void setPrevious(Situation previous) {
        this.previous = previous;
    }

    public Iterable<Situation> getFollowing() {
        return following;
    }

    public void setFollowing(Iterable<Situation> following) {
        this.following = following;
    }
}
