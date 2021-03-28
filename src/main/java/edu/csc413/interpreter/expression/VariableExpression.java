
/*
 * Created by Joseph Edradan
 *
 * Github: https://github.com/josephedradan
 *
 * Date created: 3/26/2021
 *
 * Purpose:
 *  VariableExpression class
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

public class VariableExpression implements Expression {

    private final String variableName;

    public VariableExpression(String variableName) {
        this.variableName = variableName;
    }

    @Override
    public int evaluate(ProgramState programState) {
        return programState.getVariable(variableName);
    }
}
