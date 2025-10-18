import javax.annotation.processing.SupportedSourceVersion;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Weight Conversion Program

        int weight;
        double new_weight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("Please enter the choice ");
        System.out.println("1: LBS to KGs");
        System.out.println("2: KGs to LBS");
        System.out.print("Select the Choice : ");
        choice = scanner.nextInt();

        if(choice==1)
        {
            System.out.print("Enter the weight in LBS : ");
            weight = scanner.nextInt();
            new_weight = weight*0.453592;
            System.out.printf("Weight in KGs is : %.2f " , new_weight);

        }
        else if(choice==2)
        {
            System.out.print("Enter the weight in KGs : ");
            weight = scanner.nextInt();
            new_weight = weight*2.20462;
            System.out.printf("Weight in LBS is: %.3f" , new_weight);

        }
        else {
            System.out.print("Enter a valid option!!!!");
        }






    }
}
