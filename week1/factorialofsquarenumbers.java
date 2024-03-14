import java.math.BigInteger;

public class factorialofsquarenumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            int squaredNumber = i * i;
            BigInteger factorial = calculateFactorial(squaredNumber);
            System.out.println("Factorial of " + squaredNumber + " is: " + factorial);
        }
    }

    private static BigInteger calculateFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
