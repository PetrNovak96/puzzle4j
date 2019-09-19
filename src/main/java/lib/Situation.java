package lib;

public abstract class Situation {

    private Situation previous;
    private Iterable<Situation> following;

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
