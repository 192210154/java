
import java.util.Stack;

public class stack {
    public static void main(String[] args)
    {
        Stack<String> J=new Stack<>();
        J.push("Rahul");
        J.push("Ramesh");                                                                                  
        J.push("Kumar");
        J.push("ramya");
        System.out.println(J);
        String kumar = J.pop();
        System.out.println(J);
        J.remove(2);
        System.out.println(J);
    }
}