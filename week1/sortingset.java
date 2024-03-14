import java.util.SortedSet;
import java.util.TreeSet;

public class sortingset {
    public static void main(String[] args)
    {
        SortedSet<String> N= new TreeSet<String>();
        N.add("hello");
        N.add("world");
        N.add("how r u?");
        System.out.println(N);
        N.remove("how r u?");
        System.out.println(N);

    }
}
