import java.util.HashMap;
import java.util.Map;

public class D4q1d {
    public static void main(String[] args) {

        Map<String, Integer> originalHashMap = new HashMap<>();
        originalHashMap.put("A", 5);
        originalHashMap.put("B", 10);
        originalHashMap.put("C", 15);
        originalHashMap.put("D", 20);
        originalHashMap.put("E", 25);


        originalHashMap.computeIfAbsent("C", k -> 5);


        System.out.println("Merged HashMap:");
        for (Map.Entry<String, Integer> entry : originalHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
