import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numOfDIce;
        int total = 0;

        System.out.print("Enter the number of dices You have roll : ");
        numOfDIce = scanner.nextInt();

        if(numOfDIce > 0)
        {
            for(int i=1;i<=numOfDIce;i++)
            {
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("Dice " +i+" : "+ roll);

                total += roll;
            }
            System.out.print("Total :" + total);
        }
        else {
            System.out.print("You didnt rolled a dice");
        }








    }
    static void printDie(int n){
        String dice1 = """
                         ----------
                        |          |
                        |          |
                        |     ●    |
                        |          |
                        |          |
                         ----------
                        """;
        String dice2 = """
                         ----------
                        |          |
                        |  ●       |
                        |          |
                        |       ●  |
                        |          |
                         ----------
                        """;
        String dice3 = """
                         ----------
                        |          |
                        |  ●       |
                        |    ●     |
                        |      ●   |
                        |          |
                         ----------
                        """;

        String dice4 = """
                         ----------
                        |           |
                        |  ●     ●  |
                        |           |
                        |  ●     ●  |
                        |           |
                         ----------
                        """;
        String dice5 = """
                         ----------
                        |           |
                        |  ●     ●  |
                        |     ●     |
                        |  ●     ●  |
                        |           |
                         ----------
                        """;
        String dice6 = """
                         ----------
                        |           |
                        |   ●   ●   |
                        |   ●   ●   |
                        |   ●   ●   |
                        |           |
                         ----------
                        """;
        switch (n) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);


        }




    }
}
