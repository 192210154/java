import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args)
    {
        Queue<Integer> B= new LinkedList<Integer>();
        B.add(65);
        B.add(43);
        B.add(86);
        B.add(95);
        B.add(28);
        System.out.println(B);
        B.remove(86);
        System.out.println(B);
        Integer Front= B.remove();
        System.out.println(B);
        boolean Back=B.add(44);
        System.out.println(B);

    }
}
