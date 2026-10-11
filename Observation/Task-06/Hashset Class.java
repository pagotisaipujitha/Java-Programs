
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); // Duplicate ignored

        System.out.println("HashSet: " + set);
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Size: " + set.size());
        System.out.println("Is empty: " + set.isEmpty());

        set.remove(10);
        System.out.println("After remove: " + set);

        set.clear();
        System.out.println("After clear: " + set);
    }
}
