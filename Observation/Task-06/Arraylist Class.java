
import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(1, 15);
        System.out.println("List: " + list);

        System.out.println("get(0): " + list.get(0));
        list.set(0, 5);
        System.out.println("After set: " + list);

        list.remove(1);                  // Remove by index
        list.remove(Integer.valueOf(10)); // Remove by object
        System.out.println("After remove: " + list);

        System.out.println("Contains 20: " + list.contains(20));
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());

        list.add(20);
        System.out.println("First index of 20: " + list.indexOf(20));
        System.out.println("Last index of 20: " + list.lastIndexOf(20));

        list.sort(Comparator.naturalOrder());
        System.out.println("Sorted list: " + list);

        list.clear();
        System.out.println("After clear: " + list);
    }
}
