import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== User Login System ===\n");

        System.out.print("Enter your Email: ");
        String email = scanner.nextLine().trim();

        // Basic email validation
        if (!email.contains("@") || !email.contains(".")) {
            System.out.println("❌ Invalid email format. Please enter a valid email (e.g., user@example.com).");
        } else {
            String username = email.substring(0, email.indexOf('@'));

            System.out.print("Enter your Password (must contain an uppercase letter and a number): ");
            String password = scanner.nextLine();

            // Validate password strength
            boolean hasUpperCase = false;
            boolean hasNumber = false;

            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) hasUpperCase = true;
                if (Character.isDigit(ch)) hasNumber = true;
            }

            if (hasUpperCase && hasNumber && password.length() >= 6) {
                System.out.println("\n✅ Login Successful!");
                System.out.println("Welcome, " + username.toUpperCase() + "!");
            } else {
                System.out.println("\n❌ Password does not meet the requirements.");
                System.out.println("Hint: Use at least 6 characters, one uppercase letter, and one number.");
            }
        }

        scanner.close();
    }
}
