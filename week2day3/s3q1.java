public class s3q2a {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3, 4, 5}; // Example array
            int index = 10; // Attempting to access an element outside the array's bounds
            int element = array[0];
            System.out.println("Element at index " + index + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
            e.printStackTrace(); // Print the stack trace for detailed information
        }
    }
}
