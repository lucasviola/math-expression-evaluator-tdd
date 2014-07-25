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

    @Test
    public void givenOneOperatorAndTwoNumbersShouldMoveOperatorToTopAndRearrange() throws Exception {
        Stack stack = new Stack();
        Evaluator evaluator = new Evaluator();
        stack.push(1);
        stack.push("*");
        stack.push(2);

        evaluator.fromInfixToPostfix(stack);
        Object result = stack.members.get(2);

        assertEquals("*", result);
    }



    @Test
    public void givenOneOperatorAndThreeNumbersShouldMoveOperatorToTopAndRearrange() throws Exception {
        Stack stack = new Stack();
        Evaluator evaluator = new Evaluator();
        stack.push(1);
        stack.push("/");
        stack.push(2);
        stack.push(11);

        evaluator.fromInfixToPostfix(stack);
        Object result = stack.members.get(3);

        assertEquals("/", result);
    }

    @Test
    public void givenTwoOperatorsAndTwoNumbersShouldMoveOpsToTopAndReArrange() throws Exception {
        Stack stack = new Stack();
        Evaluator evaluator = new Evaluator();
        stack.push("-");
        stack.push(1);
        stack.push("+");
        stack.push(11);

        evaluator.fromInfixToPostfix(stack);
        Object result = stack.members.get(2);
        Object secondResult = stack.members.get(3);

        assertEquals("+", result);
        assertEquals("-", secondResult);
    }


}
