package cz.vse._4iz430.novp19.puzzle4j;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Visualiser<T extends Situation> {

    public String visualise(T situation) {
        T initial = this.getInitialSituation(situation);
        List<T> parents = new ArrayList<T>();
        parents.add(initial);
        String row = this.getNode(parents)+"\n";
        while (parents.size() > 0) {
            List<T> temp = new ArrayList<T>();
            for (T parent : parents) {
                if (parent.getFollowings().size() > 0) {
                    temp.addAll((Collection<? extends T>) parent.getFollowings());
                    row += this.getNode((Iterable<T>) parent.getFollowings());
                }
            }
            row += "\n";
            parents = temp;
        }

        return row;
    }

    private T getInitialSituation(T situation) {
        T temp = situation;
        while(temp.getPrevious() != null) {
            temp = (T) temp.getPrevious();
        }
        return temp;
    }

    public String getNode(Iterable<T> situations) {
        String result = "|";

        for(T situation: situations) {
            result += " " + situation + " ";
        }
        result += "|";
        return result;
    }
}
