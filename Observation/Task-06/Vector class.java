
import java.util.*;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();

        v.add("Java");
        v.add("Python");
        v.addElement("C");
        v.add("JavaScript");

        System.out.println("Vector: " + v);
        System.out.println("get(1): " + v.get(1));

        v.set(1, "C++");
        System.out.println("After set: " + v);

        v.remove(0);
        v.removeElement("C");
        System.out.println("After remove: " + v);

        System.out.println("Size: " + v.size());
        System.out.println("Capacity: " + v.capacity());
        System.out.println("Contains C++: " + v.contains("C++"));
    }
}
