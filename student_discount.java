import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        double price = 999;
        System.out.print("Are you a student: (true/false) ") ;
        isStudent = scanner.nextBoolean();
        if(isStudent)
        {
            System.out.println("You are a student and you will get the Discount of 50%");
            price *= 0.5;
            System.out.print("Amount Payable: ");
            System.out.print(price);

        }
        else
        {
            System.out.printf("The price of the product is : %d",price);
        }




    }
}
