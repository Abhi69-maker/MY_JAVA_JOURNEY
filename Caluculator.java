import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Simple Calculator ===");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operator) {
            case '+' -> result = num1 + num2;

            case '-' -> result = num1 - num2;

            case '*' -> result = num1 * num2;

            case '/' -> {
                if (num2 != 0)
                    result = num1 / num2;
                else {
                    System.out.println("Error: Division by zero!");
                    scanner.close();
                    return;
                }
            }

            case '%' -> result = num1 % num2;

            default -> {
                System.out.println("Invalid operator!");
                scanner.close();
            }

        }

        System.out.printf("Result: %.2f %c %.2f = %.2f%n", num1, operator, num2, result);

     

        scanner.close();
    }
}

