import java.util.Arrays;
import java.util.Scanner;

public class anagramstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine().toLowerCase();

        boolean areAnagrams = checkAnagrams(str1, str2);

        if (areAnagrams) {
            System.out.println("The given strings are anagrams.");
        } else {
            System.out.println("The given strings are not anagrams.");
        }

        scanner.close();
    }

    private static boolean checkAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to char arrays
        char[] charArray1 = str1.replaceAll("\\s", "").toCharArray();
        char[] charArray2 = str2.replaceAll("\\s", "").toCharArray();

        // Check if lengths are equal
        if (charArray1.length != charArray2.length) {
            return false;
        }

        // Sort the char arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
