package edu.csc413.interpreter.expression;

import edu.csc413.interpreter.ProgramState;

/**
 * A conditional comparison that can evaluate to true or false.
 */
public abstract class Condition {

    private final Expression LhsExpression;
    private final Expression rhsExpression;

    public Condition(Expression lhsExpression, Expression rhsExpression) {
        this.LhsExpression = lhsExpression;
        this.rhsExpression = rhsExpression;
    }

    /**
     * Resolves the comparison to true or false based on the lhs and rhs expressions and the operator.
     */
    public abstract boolean evaluate(ProgramState programState);

    // TODO: Implement. You can add additional non-public methods.
    protected Expression getLhsExpression() {
        return LhsExpression;
    }

    protected Expression getRhsExpression() {
        return rhsExpression;
    }
}
