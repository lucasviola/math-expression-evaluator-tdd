import java.util.ArrayList;

public class Stack {

    ArrayList<Integer> members;

    public Stack() {
        this.members = new ArrayList<Integer>();
    }

    public void push(int i) {
        members.add(i);
    }

    public void pop() {
        members.remove(members.size() - 1);
    }

    public int read() {
        return members.get(members.size() - 1);
    }


}
