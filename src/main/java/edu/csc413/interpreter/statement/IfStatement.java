
/*
 * Created by Joseph Edradan
 *
 * Github: https://github.com/josephedradan
 *
 * Date created: 3/27/2021
 *
 * Purpose:
 *  IfStatement class
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
import edu.csc413.interpreter.expression.Condition;

import java.util.List;

public class IfStatement implements Statement {

    private final Condition condition;
    private final List<Statement> bodyStatements;

    public IfStatement(Condition condition, List<Statement> bodyStatements) {
        this.condition = condition;
        this.bodyStatements = bodyStatements;
    }

    @Override
    public void run(ProgramState programState) {
        if (condition.evaluate(programState)) {
            for (Statement statement : bodyStatements) {
                statement.run(programState);
            }
        }
    }
}
