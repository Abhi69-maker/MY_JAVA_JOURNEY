import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(Math.addExact(5, 3));   // 8
        System.out.println(Math.subtractExact(10, 4)); // 6
        System.out.println(Math.multiplyExact(6, 7));  // 42
        System.out.println(Math.floorDiv(10, 3));  // 3
        System.out.println(Math.floorMod(10, 3));  // 1

        System.out.println(Math.pow(5, 2));   // 25.0
        System.out.println(Math.sqrt(25));    // 5.0
        System.out.println(Math.cbrt(27));    // 3.0 (cube root)

        System.out.println(Math.sin(Math.toRadians(30))); // 0.5
        System.out.println(Math.cos(Math.toRadians(60))); // 0.5
        System.out.println(Math.tan(Math.toRadians(45))); // 1.0

        // Inverse functions
        System.out.println(Math.asin(0.5));   // returns radians (~0.5236)
        System.out.println(Math.acos(0.5));   // (~1.0472)
        System.out.println(Math.atan(1));     // (~0.7854 or 45°)

        System.out.println(Math.exp(1));      // e^1 = 2.71828
        System.out.println(Math.log(10));     // Natural log (ln)
        System.out.println(Math.log10(100));  // Base 10 log = 2

        System.out.println(Math.ceil(4.1));   // 5.0
        System.out.println(Math.floor(4.9));  // 4.0
        System.out.println(Math.round(4.5));  // 5
        System.out.println(Math.abs(-12.7));  // 12.7

        System.out.println(Math.random());           // random double (0.0 to 1.0)
        System.out.println((int)(Math.random() * 10)); // random int 0–9

        Random rand = new Random();
        System.out.println(rand.nextInt(100));      // random int 0–99
        System.out.println(rand.nextDouble());      // random double 0.0–1.0
        System.out.println(rand.nextBoolean());     // random true/false

        System.out.println(Math.toRadians(180));  // converts degrees → radians
        System.out.println(Math.toDegrees(Math.PI)); // radians → degrees

        System.out.println(Math.max(10, 25));   // 25
        System.out.println(Math.min(-5, 3));    // -5
        System.out.println(Math.signum(-12.3)); // -1.0 (sign indicator)






        scanner.close();
    }
}
