
import java.util.*;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(1, "Java");
        table.put(2, "Python");
        table.put(3, "C");

        System.out.println("Hashtable: " + table);
        System.out.println("Value of key 1: " + table.get(1));
        System.out.println("Contains key 2: " + table.containsKey(2));
        System.out.println("Contains value C: " + table.containsValue("C"));

        Enumeration<Integer> keys = table.keys();
        System.out.print("Keys: ");
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();

        Enumeration<String> values = table.elements();
        System.out.print("Values: ");
        while (values.hasMoreElements()) {
            System.out.print(values.nextElement() + " ");
        }
        System.out.println();

        System.out.println("Size: " + table.size());
        System.out.println("Is empty: " + table.isEmpty());

        table.remove(2);
        System.out.println("After remove: " + table);
    }
}
