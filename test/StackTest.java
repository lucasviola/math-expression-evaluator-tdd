import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.hamcrest.CoreMatchers.*;

public class StackTest {

    @Test
    public void shouldPushNumberToStack() throws Exception {
        Stack stack = new Stack();

        stack.push(2);

        int result = stack.members.get(stack.members.size() - 1);

        assertThat(result, is(2));
    }

    @Test
    public void whenPushTwoNumbersReturnNumberOnTheTop() throws Exception {
        Stack stack = new Stack();
        stack.push(2);
        stack.push(5);

        int result = stack.members.get(stack.members.size() - 1);

        assertThat(result, is(5));
    }

    @Test
    public void shouldPopLastNumber() throws Exception {
        Stack stack = new Stack();

        stack.push(2);
        stack.pop();

        assertTrue(stack.members.isEmpty());
    }

    @Test
    public void returnLastNumber() throws Exception {
        Stack stack = new Stack();

        stack.push(2);
        int result = stack.read();

        assertThat(result, is(2));
    }
}