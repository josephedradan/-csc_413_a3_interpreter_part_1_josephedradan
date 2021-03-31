
/*
 * Created by Joseph Edradan
 *
 * Github: https://github.com/josephedradan
 *
 * Date created: 3/30/2021
 *
 * Purpose:
 *  BlackStatement class
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

import edu.csc413.interpreter.expression.Condition;

import java.util.List;

public abstract class BlockStatement implements Statement {

    private final Condition condition;
    private final List<Statement> bodyStatements;

    public BlockStatement(Condition condition, List<Statement> bodyStatements) {
        this.condition = condition;
        this.bodyStatements = bodyStatements;
    }

    protected Condition getCondition() {
        return condition;
    }

    protected List<Statement> getBodyStatements() {
        return bodyStatements;
    }
}
