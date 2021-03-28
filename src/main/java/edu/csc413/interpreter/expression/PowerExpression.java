
/*
 * Created by Joseph Edradan
 *
 * Github: https://github.com/josephedradan
 *
 * Date created: 3/27/2021
 *
 * Purpose:
 *  PowerExpression class
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

import edu.csc413.interpreter.ProgramState;

public class PowerExpression extends ArithmeticExpression {

    public PowerExpression(Expression LhsExpression, Expression rhsExpression) {
        super(LhsExpression, rhsExpression);
    }

    @Override
    public int evaluate(ProgramState programState) {
        int valueLhs = getLhsExpression().evaluate(programState);
        int valueRhs = getRhsExpression().evaluate(programState);
        return (int) Math.pow(valueLhs, valueRhs);
    }
}
