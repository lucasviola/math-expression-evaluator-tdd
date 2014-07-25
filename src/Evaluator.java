public class Evaluator {

    public void fromInfixToPostfix(Stack stack) {
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
}

