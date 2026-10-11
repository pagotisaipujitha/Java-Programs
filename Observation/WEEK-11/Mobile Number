
import java.util.Scanner;

class LengthNotSufficientException extends Exception {
    public LengthNotSufficientException(String message) {
        super(message);
    }
}

public class MobileValidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String number = sc.next();

        try {
            // Check whether all characters are digits
            if (!number.matches("[0-9]+")) {
                throw new NumberFormatException();
            }

            // Check whether the length exceeds 10
            if (number.length() > 10) {
                throw new ArrayIndexOutOfBoundsException();
            }

            // Check whether the length is less than 10
            if (number.length() < 10) {
                throw new LengthNotSufficientException(
                    "LengthNotSufficientException");
            }

            System.out.println("Valid number");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Invalid Mobile Number-ArrayIndexOutOfBounds Exception");
        }
        catch (LengthNotSufficientException e) {
            System.out.println(
                "Invalid Mobile Number-LengthNotSufficientException");
        }
        catch (NumberFormatException e) {
            System.out.println(
                "Invalid Mobile Number-NumberFormatException");
        }

        sc.close();
    }
}
