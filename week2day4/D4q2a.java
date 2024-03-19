import java.util.TreeMap;
import java.util.Map;

public class D4q2a {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Add entries to the TreeMap
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Carrot", 30);
        treeMap.put("Orange", 40);
        treeMap.put("Grapes", 50);

        // Display the TreeMap before removal
        System.out.println("TreeMap before removal:");
        System.out.println(treeMap);

        // Remove and retrieve the first entry
        Map.Entry<String, Integer> firstEntry = treeMap.pollFirstEntry();
        System.out.println("First Entry Removed: " + firstEntry);

        // Remove and retrieve the (n-1)th entry
        int n = treeMap.size();
        int count = 0;
        Map.Entry<String, Integer> nMinusOneEntry = null;
        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            count++;
            if (count == n - 1) {
                nMinusOneEntry = entry;
                break;
            }
        }
        if (nMinusOneEntry != null) {
            treeMap.remove(nMinusOneEntry.getKey());
            System.out.println("(n-1)th Entry Removed: " + nMinusOneEntry);
        }

        // Display the TreeMap after removal
        System.out.println("TreeMap after removal:");
        System.out.println(treeMap);
    }
}
