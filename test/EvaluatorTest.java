import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;

public class EvaluatorTest {

    @Test
    public void givenOneOperatorAndOneNumberShouldMoveOperatorToTopAndRearrange() throws Exception {
        Stack stack = new Stack();
        Evaluator evaluator = new Evaluator();
        stack.push("+");
        stack.push("1");

        evaluator.fromInfixToPostfix(stack);
        Object result = stack.members.get(1);

        assertEquals("+", result);

    }
}
