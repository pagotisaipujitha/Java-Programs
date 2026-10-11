
import java.util.*;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();

        map.put(1, "Apple");
        map.put(2, "Mango");
        map.put(3, "Orange");

        System.out.println("Map: " + map);
        System.out.println("Value of key 2: " + map.get(2));
        System.out.println("Contains key 1: " + map.containsKey(1));
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());

        map.remove(1);
        System.out.println("After remove: " + map);
    }
}
