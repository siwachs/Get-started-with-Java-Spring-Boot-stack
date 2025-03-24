import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class Advance {
    public static void main(String[] args) {
        int[] numbers = new int[3]; // Fixed size
        numbers[0] = 10; // Direct access
        System.out.println(numbers[0]); // Output: 10

        ArrayList<Integer> list = new ArrayList<>(); // Dynamic size
        list.add(10); // Autoboxing: int → Integer
        list.add(20);
        System.out.println(list.get(0)); // Output: 10

        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");

        System.out.println(students.get(2)); // Output: Bob

        Map<Integer, String> _students = new LinkedHashMap<>();
        _students.put(1, "Alice");
        _students.put(2, "Bob");
        _students.put(3, "Charlie");

        System.out.println(_students);
        // Output: {1=Alice, 2=Bob, 3=Charlie} (order preserved)

        Map<Integer, String> __students = new TreeMap<>();
        __students.put(3, "Charlie");
        __students.put(1, "Alice");
        __students.put(2, "Bob");

        System.out.println(__students);
        // Output: {1=Alice, 2=Bob, 3=Charlie} (sorted by key)

        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get()); // Output: Hello
    }
}
