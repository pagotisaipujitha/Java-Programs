
import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Mango");
        list.addFirst("Banana");
        list.addLast("Orange");

        System.out.println("List: " + list);
        System.out.println("get(1): " + list.get(1));
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        list.remove(1);
        list.remove("Orange");
        System.out.println("After remove: " + list);

        System.out.println("Removed first: " + list.removeFirst());
        System.out.println("Removed last: " + list.removeLast());

        list.offer("Grapes");
        list.offer("Pineapple");
        System.out.println("After offer: " + list);

        System.out.println("poll(): " + list.poll());
        System.out.println("peek(): " + list.peek());
        System.out.println("Final list: " + list);
    }
}
