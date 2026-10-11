
import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);

        System.out.println("TreeSet: " + set);
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        System.out.println("Higher than 20: " + set.higher(20));
        System.out.println("Lower than 20: " + set.lower(20));
        System.out.println("Ceiling of 25: " + set.ceiling(25));
        System.out.println("Floor of 25: " + set.floor(25));

        System.out.println("Removed first: " + set.pollFirst());
        System.out.println("Removed last: " + set.pollLast());
        System.out.println("Final set: " + set);

        set.remove(20);
        System.out.println("After remove: " + set);
    }
}
