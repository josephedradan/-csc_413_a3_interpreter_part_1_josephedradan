package edu.csc413.interpreter;

import java.util.Hashtable;

/**
 * ProgramState represents the Program's storage information at any point in time while the program is running. It
 * should keep track of all defined variables, as well as their assigned values, and allow the running program to read
 * or set those values.
 */
public class ProgramState {
    // TODO: Implement. Add instance variables.

    private final Hashtable<String, Integer> hashtable;

    public ProgramState() {
        this.hashtable = new Hashtable<>();
    }

    public int getVariable(String variable) {
        return hashtable.get(variable);
    }

    public void setVariable(String variable, int value) {
        hashtable.put(variable, value);
    }
}
