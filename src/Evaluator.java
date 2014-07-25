public class Evaluator {

    Stack stack;

    public Evaluator(Stack stack) {
        this.stack = stack;
    }

    public void fromInfixToPostfix() {
        for(int i = 0; i < stack.members.size(); i++){
            if(stack.members.get(i).equals("+")){
                stack.members.remove(i);
                stack.push("+");
            }

            if(stack.members.get(i).equals("-")){
                stack.members.remove(i);
                stack.push("-");
            }

            if(stack.members.get(i).equals("*")){
                stack.members.remove(i);
                stack.push("*");
            }

            if(stack.members.get(i).equals("/")){
                stack.members.remove(i);
                stack.push("/");
            }

        }
    }


    public Object eval() {


        return 0;
    }
}

