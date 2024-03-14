import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args)
    {
        TreeSet<String> K=new TreeSet<String>();
        K.add("life");
        K.add("is");
        K.add("beautiful");
        System.out.println(K);
        K.remove("is");
        System.out.println(K);

    }
}
