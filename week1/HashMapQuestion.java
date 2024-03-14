import java.util.HashMap;

public class HashMapQuestion {
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Vishnu",39);
        map.put("Varma",45);
        map.put("Narendra",12);
        map.put("Array",34);
        System.out.println("Size of map is:- "+ map.size());
        System.out.println(map);
        map.replace("Narendra",07);
        System.out.println(map);
    }
}