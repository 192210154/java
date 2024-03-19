public class s3q1b {
    public static void main(String[] args) {
        try {
            double number = -10.0;
            if (number <= 0) {
                throw new ArithmeticException("Logarithm of zero or a negative number is undefined");
            }
            double result = Math.log(number);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
