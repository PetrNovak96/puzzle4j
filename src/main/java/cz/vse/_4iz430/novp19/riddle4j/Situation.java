package cz.vse._4iz430.novp19.riddle4j.lib;

import java.util.ArrayList;
import java.util.List;

public abstract class Situation {

    private Situation previous;
    private List<Situation> followings = new ArrayList<Situation>();

    public Situation() {
        Class<? extends Situation> child = this.getClass();
    }

    public Situation getPrevious() {
        return previous;
    }

    public void setPrevious(Situation previous) {
        this.previous = previous;
    }

    public void addFollowing(Situation situation) {
        this.followings.add(situation);
    }

    public List<Situation> getFollowings() {
        return this.followings;
    }

    public abstract boolean isEqual(Situation situation);

    public abstract boolean isGoalSituation();
}
