
import java.util.*;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C");
        set.add("Java");

        System.out.println("Set: " + set);
        System.out.println("Contains Python: " + set.contains("Python"));
        System.out.println("Size: " + set.size());

        set.remove("C");
        System.out.println("After remove: " + set);

        set.clear();
        System.out.println("After clear: " + set);
    }
}
