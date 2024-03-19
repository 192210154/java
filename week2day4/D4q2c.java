import java.util.TreeMap;
import java.util.Map;
import java.util.SortedMap;

public class D4q2c {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add entries to the TreeMap
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Carrot", 30);
        treeMap.put("Date", 40);
        treeMap.put("Elderberry", 50);
        treeMap.put("Fig", 60);
        treeMap.put("Grapes", 70);

        // Display the original TreeMap
        System.out.println("Original TreeMap:");
        System.out.println(treeMap);

        // Derive a submap starting from key "A" (inclusive) and ending with key "D" (exclusive)
        SortedMap<String, Integer> subMap = treeMap.subMap("A", "E");

        // Display the submap
        System.out.println("\nSubmap from key 'A' to 'D':");
        System.out.println(subMap);
    }
}
