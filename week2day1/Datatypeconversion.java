public class Datatypeconversion {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue = intValue;
        float floatValue = longValue;
        double doubleValue = floatValue;
        System.out.println("Implicit Conversion (Widening):");
        System.out.println("int to long: " + longValue);
        System.out.println("long to float: " + floatValue);
        System.out.println("float to double: " + doubleValue);
        double doubleNum = 123.456;
        float floatNum = (float) doubleNum;
        long longNum = (long) floatNum;
        int intNum = (int) longNum;
        System.out.println("\nExplicit Conversion (Narrowing):");
        System.out.println("double to float: " + floatNum);
        System.out.println("float to long: " + longNum);
        System.out.println("long to int: " + intNum);
        int largeInt = Integer.MAX_VALUE;
        short shortNum = (short) largeInt;
        byte byteNum = (byte) largeInt;
        System.out.println("\nOverflow and Underflow:");
        System.out.println("int to short (Overflow): " + shortNum);
        System.out.println("int to byte (Overflow): " + byteNum);
        int smallInt = Integer.MIN_VALUE;
        short shortNum2 = (short) smallInt;
        byte byteNum2 = (byte) smallInt;
        System.out.println("int to short (Underflow): " + shortNum2);
        System.out.println("int to byte (Underflow): " + byteNum2);
    }
}