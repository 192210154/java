public class s3q2d {

    public static void accessArrayElements(int[] arr) {
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        int[] correctArray = {1, 2, 3};
        int[] incorrectArray = null;

        System.out.println("Accessing elements of correct array:");
        accessArrayElements(correctArray);

        System.out.println("\nAccessing elements of incorrect array:");
        accessArrayElements(incorrectArray);
    }
}
