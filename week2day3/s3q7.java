class NonIntegerValueException extends Exception {
    public NonIntegerValueException() {
        super("Non-integer value entered.");
    }
}
class UserInputValidatorss {
    public static void validateIntegerInput(String input) throws NonIntegerValueException {
        try {
            int number = Integer.parseInt(input);

            if (number < Integer.MIN_VALUE || number > Integer.MAX_VALUE) {
                throw new NonIntegerValueException();
            }
        } catch (NumberFormatException e) {
            throw new NonIntegerValueException();
        }
    }
}
public class s3q7 {
    public static void main(String[] args) {
        String userInput = "18S";
        try {
            UserInputValidatorss.validateIntegerInput(userInput);
            System.out.println("User input is valid: " + userInput);
        } catch (NonIntegerValueException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}