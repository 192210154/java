import java.util.ArrayList;
public class Array_list {
    public static void main(String[] args)
    {
        ArrayList<Integer> M=new ArrayList<Integer>();
        M.add(45);
        M.add(117);
        M.add(17);
        M.add(50);
        M.add(100);
        System.out.println(M);
        M.remove(2);
        System.out.print(M);
    }
}
