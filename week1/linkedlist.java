import java.util.LinkedList;

public class linkedlist {
    public static void main(String[] args)
    {
        LinkedList<String> L=new LinkedList<String>();
        L.add("2");
        L.add("3");
        L.add("4");
        System.out.println(L);
        L.remove("3");
        System.out.print(L);
    }
}