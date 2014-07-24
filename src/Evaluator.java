public class Evaluator {

    public void fromInfixToPostfix(Stack stack) {

            if(stack.members.contains("+"))
                stack.push("+");

    }
}