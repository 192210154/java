import java.util.stream.IntStream;

public class evennumberrs {
    public static void main(String[] args){
        IntStream.iterate(2, i -> i < 11, i -> i + 2).forEach(System.out::println);
    }
}
