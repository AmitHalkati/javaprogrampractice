package Day7;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email address: ");
        String email = scanner.nextLine().trim();

        if (isValidEmail(email)) {
            System.out.println("Valid email address: " + email);
        } else {
            System.out.println("Invalid email address: " + email);
        }

        scanner.close();
    }

    public static boolean isValidEmail(String email) {
        // Regular expression for validating email addresses
        String regex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
	}

}
