
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C");

        System.out.println("Map: " + map);
        System.out.println("Value of key 1: " + map.get(1));

        map.put(2, "C++");
        System.out.println("After update: " + map);

        System.out.println("Contains key 1: " + map.containsKey(1));
        System.out.println("Contains value C: " + map.containsValue("C"));
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());
        System.out.println("Entries: " + map.entrySet());
        System.out.println("Size: " + map.size());
        System.out.println("Is empty: " + map.isEmpty());
        System.out.println("Missing key default: "
                           + map.getOrDefault(5, "Not Found"));

        map.remove(3);
        System.out.println("After remove: " + map);

        map.clear();
        System.out.println("After clear: " + map);
    }
}
