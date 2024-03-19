import java.util.HashMap;
import java.util.Map;

public class D4q1c {
    public static void main(String[] args) {
       
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");
        hashMap.put(4, "Mango");

        System.out.println("HashMap Entries:");
        System.out.println(hashMap);

        System.out.println("\nIterating over entries using for-each loop:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("\nIterating over entries using forEach() method:");
        hashMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("\nIterating over entries using streams:");
        hashMap.entrySet().stream()
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
    }
}
