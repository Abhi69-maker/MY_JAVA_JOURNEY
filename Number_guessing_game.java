import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1; // Random number between 1–100
        int guess = 0;
        int attempts = 0;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("I'm thinking of a number between 1 and 100...");

        while (guess != randomNumber) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("🎉 Correct! You guessed it in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}
