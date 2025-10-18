import java.util.Scanner;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the star pattern: ");
        int rows = scanner.nextInt();

        System.out.println("\nStar Pattern:\n");

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Inner loop for stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(); // Move to next line after each row
        }

        scanner.close();

}
