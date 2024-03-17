import java.util.Arrays;

public class EqualizeArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        if (array1.length != array2.length) {
            int minLength = Math.min(array1.length, array2.length);
            if (array1.length > array2.length) {
                array1 = Arrays.copyOf(array1, minLength);
            } else {
                array2 = Arrays.copyOf(array2, minLength);
            }
            System.out.println("Arrays have been adjusted to equal length.");
        } else {
            System.out.println("Arrays already have equal length.");
        }

        System.out.println("Adjusted Array 1: " + Arrays.toString(array1));
        System.out.println("Adjusted Array 2: " + Arrays.toString(array2));
    }
}