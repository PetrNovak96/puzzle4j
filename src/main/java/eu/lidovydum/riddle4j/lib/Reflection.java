package eu.lidovydum.riddle4j.lib;

import org.reflections.Reflections;

import java.util.HashSet;
import java.util.Set;

public class Reflection {

    private static Reflections reflections = new Reflections("eu.lidovydum.riddle4j");

    public static Set<Rule> getRules() {
        Set<Class<? extends Rule>> ruleClasses = reflections.getSubTypesOf(Rule.class);
        Set<Rule> rules = new HashSet<Rule>();
        for (Class ruleClass : ruleClasses) {
            try {
                rules.add((Rule) ruleClass.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return rules;
    }

    public static Set<Move> getMoves() {
        Set<Class<? extends Move>> moveClasses = reflections.getSubTypesOf(Move.class);
        Set<Move> moves = new HashSet<Move>();
        for (Class moveClass : moveClasses) {
            try {
                moves.add((Move) moveClass.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return moves;
    }
}
