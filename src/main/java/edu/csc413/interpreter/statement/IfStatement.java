
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

public class IfStatement extends BlockStatement {

    public IfStatement(Condition condition, List<Statement> bodyStatements) {
        super(condition, bodyStatements);
    }

    @Override
    public void run(ProgramState programState) {
        if (this.getCondition().evaluate(programState)) {
            for (Statement statement : this.getBodyStatements()) {
                statement.run(programState);
            }
        }
    }
}
