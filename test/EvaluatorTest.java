import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;

public class EvaluatorTest {

    @Test
    public void givenTwoNumbersAndOneOperatorConvertToPostfix() throws Exception {
       Stack stack = new Stack();
       Evaluator evaluator = new Evaluator();
       stack.push(2);
       stack.push("+");
       stack.push(5);
       evaluator.fromInfixToPostfix(stack);

       Object result = stack.members.get(stack.members.size() - 1);

        assertEquals("+", result);
    }
}
