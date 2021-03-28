
/*
 * Created by Joseph Edradan
 *
 * Github: https://github.com/josephedradan
 *
 * Date created: 3/26/2021
 *
 * Purpose:
 *  ConstantExpression class
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

public class ConstantExpression implements Expression {

    private final int value;

    public ConstantExpression(int value) {
        this.value = value;
    }

    @Override
    public int evaluate(ProgramState programState) {
        return value;
    }
}
