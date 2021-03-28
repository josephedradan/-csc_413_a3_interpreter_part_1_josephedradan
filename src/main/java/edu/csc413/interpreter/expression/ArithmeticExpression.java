
/*
 * Created by Joseph Edradan
 *
 * Github: https://github.com/josephedradan
 *
 * Date created: 3/27/2021
 *
 * Purpose:
 *  ArithmeticExpression class
 *
 * Details:
 *
 * Description:
 *
 * Notes:
 *
 * IMPORTANT NOTES:
 *
 * Explanation:
 *
 * Reference:
 *
 */

package edu.csc413.interpreter.expression;

public abstract class ArithmeticExpression implements Expression {

    private final Expression LhsExpression;
    private final Expression rhsExpression;

    public ArithmeticExpression(Expression LhsExpression, Expression rhsExpression) {
        this.LhsExpression = LhsExpression;
        this.rhsExpression = rhsExpression;
    }

    protected Expression getLhsExpression() {
        return LhsExpression;
    }

    protected Expression getRhsExpression() {
        return rhsExpression;
    }
}
