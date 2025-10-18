import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature (in °C): ");
        double temp = scanner.nextDouble();

        System.out.print("Is it sunny outside? (true/false): ");
        boolean isSunny = scanner.nextBoolean();

        System.out.println("\n--- Weather Report ---");

        if (temp >= 0 && temp <= 30) {
            System.out.println("Temperature is good 😉");
            if (isSunny) {
                System.out.println("It's sunny outside ☀️");
            } else {
                System.out.println("It's cloudy outside ☁️");
            }
        } else {
            System.out.println("The weather is bad 😞");
        }

        scanner.close();
    }
}
