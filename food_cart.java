import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        int price;
        double total;
        int quantity;
        char currency = '$';
        System.out.print("Enter the item you want :");
        item = scanner.nextLine();
        System.out.print("Enter the Quantity :");
        quantity = scanner.nextInt();
        System.out.print("Enter the Price of that item : ");
        price = scanner.nextInt();
        total = price * quantity;
        System.out.print("Total amount payable: ");
        System.out.print(total);




       scanner.close();
    }
}
