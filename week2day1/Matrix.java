import java.util.Arrays;
public    class Matrix{
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] matrix = new int[rows][cols];
        int value = 1;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}