import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


//      area = pi*r^2
//      circumference = 2*pi*r
//      volume = (4/3)*pi*r*r

        System.out.print("Enter the radius of the Circle : ");
        float r = scanner.nextFloat();

        double area = Math.PI * r * r;
        System.out.println("Area of the Circle is : " + area);

        double circumference = Math.PI * r * 2;
        System.out.println("circumference of the Circle is : " + circumference);

        double volume = Math.PI * (4/3) * r * r;
        System.out.println("Volume of the Circle is : " + volume);


        scanner.close();
    }
}
