import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int principle;
        double amount;
        int rate;
        int years;
        int n;

        System.out.println("Enter the Principle Amount");
        principle = scanner.nextInt();
        System.out.print("Enter the Intrest Rate : ");
        rate = scanner.nextInt();
        System.out.print("Enter the the number of years :");
        years = scanner.nextInt();
        System.out.print("Enter the number of times the compound per year :");
        n = scanner.nextInt();

        amount = principle*Math.pow((1+(rate/n)),n*years);
        System.out.printf("The Amount after %d years is: ",years);
        System.out.println(amount);



    }
}
