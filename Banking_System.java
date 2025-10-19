import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Balance = 10000;
        boolean isRunning = true;
        int choice;

        while (isRunning) {
            System.out.println("____________________Banking System________________");
            System.out.println("Enter your choice \n1.Check Balance \n2.Deposit \n3.Withdraw \n4.Exit");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Your Bank Balance is : " + Balance);

                case 2 -> {
                    System.out.println("Enter the Money you want to Deposit :");
                    int deposit = scanner.nextInt();
                    Balance += deposit;
                    System.out.println("Your new Balance After depositing is : " + Balance);
                }

                case 3 -> {
                    System.out.print("Enter the Money you Want to Withdraw :");
                    int withdraw = scanner.nextInt();
                    if (withdraw > Balance)
                        System.out.println("Insufficient Balance!");
                    else {
                        Balance -= withdraw;
                        System.out.println("Your new Balance After Withdraw is : " + Balance);
                    }
                }

                case 4 -> {
                    isRunning = false;
                    System.out.println("Thank you for using our Banking System!");
                }

                default -> System.out.println("Invalid Choice");
            }
        }
    }
}
