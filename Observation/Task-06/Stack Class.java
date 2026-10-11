
import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("Stack: " + s);
        System.out.println("Top element: " + s.peek());
        System.out.println("Removed: " + s.pop());
        System.out.println("After pop: " + s);
        System.out.println("Is empty: " + s.empty());
        System.out.println("Position of 10: " + s.search(10));
    }
}
