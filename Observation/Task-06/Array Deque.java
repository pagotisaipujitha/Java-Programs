
import java.util.*;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(20);
        dq.addLast(30);
        dq.offerFirst(10);
        dq.offerLast(40);

        System.out.println("Deque: " + dq);
        System.out.println("First: " + dq.peekFirst());
        System.out.println("Last: " + dq.peekLast());

        System.out.println("Removed first: " + dq.pollFirst());
        System.out.println("Removed last: " + dq.pollLast());

        System.out.println("Final deque: " + dq);
    }
}
