import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class D4q1a {
    public static void main(String[] args) {

        HashMap<String, String> super1 = new HashMap<>();
        HashMap<String, String> super2 = new HashMap<>();


        super1.put("Batman", "Bruce Wayne");
        super1.put("Superman", "Clark Kent");
        super1.put("Spiderman", "Peter Parker");

        super2.put("Batgirl", "Barbara Gordon");
        super2.put("Ironman", "Tony Stark");
        super2.put("Wonder Woman", "Diana Prince");

        removeKeysStartingWithB(super1);


        removeKeysStartingWithB(super2);

        System.out.println("super1 after removing keys starting with 'B':");
        displayMap(super1);

        System.out.println("\nsuper2 after removing keys starting with 'B':");
        displayMap(super2);
    }


    public static void removeKeysStartingWithB(HashMap<String, String> map) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            if (entry.getKey().startsWith("B")) {
                iterator.remove();
            }
        }
    }


    public static void displayMap(HashMap<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
