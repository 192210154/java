import java.util.EnumMap;

enum Sports {
    Cricket, Football, Tennis, Basketball, Handball, Baseball
}

public class D4q3a {
    public static void main(String[] args) {

        EnumMap<Sports, String> enumMap = new EnumMap<>(Sports.class);

        enumMap.put(Sports.Cricket, "Cricket");
        enumMap.put(Sports.Football, "Football");
        enumMap.put(Sports.Tennis, "Tennis");


        if (enumMap.containsKey(Sports.Handball)) {
            System.out.println("Key 'Handball' is present in the EnumMap.");
        } else {
            System.out.println("Key 'Handball' is not present in the EnumMap.");

            enumMap.clear();
            System.out.println("EnumMap cleared.");
        }
    }
}
