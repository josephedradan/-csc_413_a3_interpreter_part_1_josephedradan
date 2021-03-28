
/*
 * Created by Joseph Edradan
 *
 * Github: https://github.com/josephedradan
 *
 * Date created: 3/26/2021
 *
 * Purpose:
 *  AssignStatement class
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

package edu.csc413.interpreter.statement;

import edu.csc413.interpreter.ProgramState;
import edu.csc413.interpreter.expression.Expression;

public class AssignStatement implements Statement {

    private final Expression expression;
    private final String name;

    public AssignStatement(String name, Expression expression) {
        this.name = name;
        this.expression = expression;
    }

    @Override
    public void run(ProgramState programState) {
        int value = expression.evaluate(programState);
        programState.setVariable(this.name, value);
    }
}
