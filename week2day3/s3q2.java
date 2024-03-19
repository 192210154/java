public class s3q2b {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3, 4, 5};
            for (int i = 0; i <= array.length; i++) {
                System.out.println("Element at index " + i + ": " + array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Iterating beyond the array length");
            e.printStackTrace(); 
        }
    }
}
