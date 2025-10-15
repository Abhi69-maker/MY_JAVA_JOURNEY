import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter an adjective: ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a noun: ");
        noun = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a verb (past tense): ");
        verb = scanner.nextLine();

        System.out.print("Enter one more adjective: ");
        adjective3 = scanner.nextLine();


        System.out.println();
        System.out.println("😂 Funny Story Time 😂");
        System.out.println("----------------------");
        System.out.println("Today, I went to a " + adjective1 + " zoo.");
        System.out.println("In one of the cages, I saw a " + noun + " eating pizza!");
        System.out.println("It was so " + adjective2 + " that even the zookeeper " + verb + " in shock!");
        System.out.println("Everyone around was " + adjective3 + " and couldn’t stop laughing!");
        System.out.println("----------------------");
        System.out.println("End of my crazy zoo adventure 🦧🍕😂");

        scanner.close();
    }
}
