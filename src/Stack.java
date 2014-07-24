import java.util.ArrayList;

public class Stack {

    ArrayList<Object> members;

    public Stack() {
        this.members = new ArrayList<Object>();
    }

    public void push(Object value) {
        members.add(value);
    }

    public void pop() {
        members.remove(members.size() - 1);
    }

    public Object read() {
        return members.get(members.size() - 1);
    }


}
