import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();


        String Computer_choice;
        String playAgain;
        String Your_choice;


        do
        {System.out.println("Enter your move\n 1.Stone\n 2.Paper\n 3.Sissors");
            Your_choice = scanner.nextLine().toUpperCase();
        String[] choices = {"Stone", "Paper", "Sissors"};

            playAgain = "Yes";


        if (!Your_choice.equals("STONE") &&
                !Your_choice.equals("PAPER") &&
                !Your_choice.equals("SISSORS")) {
            System.out.println("Invalid Choice");
            continue;

        }

        Computer_choice = choices[random.nextInt(3)];
        System.out.println("Computer Choice : " + Computer_choice);

        if (Your_choice.equals(Computer_choice)) {
            System.out.println("Its a Tie");
        } else if (Your_choice.equals("Stone") && Computer_choice.equals("Sissors")) {
            System.out.println("You Won");
        } else if (Your_choice.equals("Sissors") && Computer_choice.equals("paper")) {
            System.out.println("You Won");
        } else if (Your_choice.equals("paper") && Computer_choice.equals("Rock")) {
            System.out.println("You Won");
        } else {
            System.out.println("You Loose");
        }
        System.out.println("Do you want to play again?(Yes/No)");
        playAgain = scanner.nextLine();
    } while(playAgain.equals("yes"));


        System.out.println("Thanks for Playing");






    }
    }
















