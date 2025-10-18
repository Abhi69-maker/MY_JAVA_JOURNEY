import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature value: ");
        double temp = scanner.nextDouble();

        System.out.print("Enter the unit (C for Celsius or F for Fahrenheit): ");
        char degree = scanner.next().toUpperCase().charAt(0);

        // Using ternary operator for conversion
        double newTemp = (degree == 'C') ? (temp * 9 / 5) + 32 :
                (degree == 'F') ? (temp - 32) * 5 / 9 : Double.NaN;

        char newDegree = (degree == 'C') ? 'F' :
                (degree == 'F') ? 'C' : ' ';

        if (Double.isNaN(newTemp)) {
            System.out.println("Invalid input! Please enter C or F.");
        } else {
            System.out.printf("Converted Temperature: %.2f°%c%n", newTemp, newDegree);
        }

        scanner.close();
    }
}
