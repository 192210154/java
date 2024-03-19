public class s3q2c {
    public static void main(String[] args) {
        try {
            int[][] nestedArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Example nested array
            int row = 2; // Example row index
            int column = 3; // Example column index that is out of bounds
            int element = nestedArray[2][1]; // Accessing an element with an incorrect index
            System.out.println("Element at row " + row + ", column " + column + ": " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Incorrect index for accessing nested array");
            e.printStackTrace(); // Print the stack trace for detailed information
        }
    }
}
