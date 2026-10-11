
import java.util.*;

public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();

        map.put(30, "C");
        map.put(10, "Java");
        map.put(20, "Python");
        map.put(40, "C++");

        System.out.println("TreeMap: " + map);
        System.out.println("Value of key 20: " + map.get(20));
        System.out.println("Contains key 10: " + map.containsKey(10));
        System.out.println("Contains value C: " + map.containsValue("C"));

        System.out.println("First key: " + map.firstKey());
        System.out.println("Last key: " + map.lastKey());
        System.out.println("Higher than 20: " + map.higherKey(20));
        System.out.println("Lower than 20: " + map.lowerKey(20));
        System.out.println("Ceiling of 25: " + map.ceilingKey(25));
        System.out.println("Floor of 25: " + map.floorKey(25));
        System.out.println("Entries: " + map.entrySet());

        map.remove(10);
        System.out.println("After remove: " + map);
    }
}
