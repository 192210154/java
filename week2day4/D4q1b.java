import java.util.HashMap;
import java.util.Map;

public class D4q1b {
    public static void main(String[] args) {

        Map<String, Integer> hashMap = new HashMap<>();


        hashMap.put("A", 5);
        hashMap.put("B", 10);
        hashMap.put("C", 15);
        hashMap.put("D", 20);
        hashMap.put("E", 25);

        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() % 5 == 0) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            }
        }
    }
}
