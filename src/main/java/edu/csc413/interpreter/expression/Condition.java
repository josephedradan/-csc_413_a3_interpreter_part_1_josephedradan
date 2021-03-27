package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;

/** A conditional comparison that can evaluate to true or false. */
public abstract class Condition {
    // TODO: Implement. Add instance variables.

    // TODO: Implement. You can modify the parameters of this constructor.
    public Condition() {
        // TODO: Implement.
    }

    /** Resolves the comparison to true or false based on the lhs and rhs expressions and the operator. */
    public abstract boolean evaluate(ProgramState programState);

    // TODO: Implement. You can add additional non-public methods.
}
