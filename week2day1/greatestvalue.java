public class greatestvalue {
    public static void main(String[] args) {
        int a = 90;
        int b = 20;
        int c = 60;

        if (a > b) {
            if (a > c) {
                System.out.println("The greatest value is in the first if statement: " + a);
            } else {
                System.out.println("The greatest value is in the third if statement: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("The greatest value is in the second if statement: " + b);
            } else {
                System.out.println("The greatest value is in the third if statement: " + c);
            }
        }
    }
}