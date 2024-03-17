import java.util.Arrays;
public class confusionmatrix {
    public static void main(String[] args) {
        int[] predicted = {1, 0, 1, 1, 0, 1, 0, 1, 1, 0};
        int[] actual = {1, 1, 0, 1, 0, 1, 0, 0, 1, 0};
        int[][] confusionMatrix = new int[2][2];
        for (int i = 0; i < predicted.length; i++) {
            if (predicted[i] == 1 && actual[i] == 1) {
                confusionMatrix[0][0]++;
            } else if (predicted[i] == 0 && actual[i] == 0) {
                confusionMatrix[1][1]++;
            } else if (predicted[i] == 1 && actual[i] == 0) {
                confusionMatrix[0][1]++;
            } else if (predicted[i] == 0 && actual[i] == 1) {
                confusionMatrix[1][0]++;
            }
        }
        int tp = confusionMatrix[0][0];
        int tn = confusionMatrix[1][1];
        int fp = confusionMatrix[0][1];
        int fn = confusionMatrix[1][0];
        double precision = (double) tp / (tp + fp);
        double recall = (double) tp / (tp + fn);
        double f1Score = 2 * (precision * recall) / (precision + recall);
        System.out.println("Confusion Matrix:");
        for (int[] row : confusionMatrix) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("True Positive (TP): " + tp);
        System.out.println("True Negative (TN): " + tn);
        System.out.println("False Positive (FP): " + fp);
        System.out.println("False Negative (FN): " + fn);
        System.out.println("F1-Score: " + f1Score);
    }
}