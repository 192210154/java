public class greatestofthreenum {
    public static void main(String[] args) {
        int num1 = 90;
        int num2 = 20;
        int num3 = 105;
        int greatest = num1 > num2 ? (num1 > num3 ? num1 : num3) : (num2 > num3 ? num2 : num3);
        System.out.println("The greatest number is: " + greatest);
    }
}