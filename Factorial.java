import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to find the Factorial of a Number :");
        int number = scanner.nextInt();
        System.out.print("Factorial of " + number + " is " + factorial(number));

        scanner.close();

    }

    static long factorial(int n) {
        long fact = 1;
        for(int i =1;i<n;i++)
        {
            fact+=fact*i;
        }
        return fact;

    }





}
