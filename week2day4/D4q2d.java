import java.util.TreeMap;
import java.util.Map;
import java.util.SortedMap;

public class D4q2d {
    public static void main(String[] args) {

        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(10, "A");
        treeMap.put(20, "B");
        treeMap.put(30, "C");
        treeMap.put(40, "D");
        treeMap.put(50, "E");

        System.out.println("Original TreeMap:");
        System.out.println(treeMap);

        SortedMap<Integer, String> portionLessThanKey = treeMap.headMap(30);

       System.out.println("\nPortion of the map whose keys are strictly less than 30:");
        System.out.println(portionLessThanKey);

        SortedMap<Integer, String> portionGreaterThanOrEqualKey = treeMap.tailMap(30);


        System.out.println("\nView of the portion of the map whose keys are greater than or equal to 30:");
        System.out.println(portionGreaterThanOrEqualKey);
    }
}
