package eu.lidovydum.riddle4j.impl;

import eu.lidovydum.riddle4j.lib.Riddle;
import eu.lidovydum.riddle4j.lib.Situation;

import java.util.ArrayList;

public class MyRiddle extends Riddle {

    protected Situation initialSituation() {
        return new MySituation();
    }

    protected Iterable<? extends Situation> successSituations() {
        return new ArrayList<MySituation>();
    }
}
