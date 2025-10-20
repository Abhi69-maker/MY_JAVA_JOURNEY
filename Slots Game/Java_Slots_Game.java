import javax.swing.*;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Java Slot Machine

        double balance = 100;

        int bet;
        int payout;
        String[] row;


        System.out.println("**********************");
        System.out.println("Wellcome to Java slots");
        System.out.println("Symbols are : 🍉 🔔 🍒 ⭐ 🍋");
        System.out.println("**********************");


        while( balance > 0)
        {
            System.out.println("Current balance : "+balance);
            System.out.println("Place your Bet : ");
            bet = scanner.nextInt();
            if(bet < 0 )
            {
                System.out.println("Bet should be grater than zero");
            }
            else if(bet > balance )
            {
                System.out.println("Insufficient Balance");
            }
            else
            {
                balance -= bet;
            }
            System.out.println("Spinning....");
            row = spinRow();
            printRow(row);
            payout = getpayOut(row,bet);
            if(payout > 0)
            {
                System.out.println("Your payout : "+ payout);
                balance += payout;
            }
            else
            {
                System.out.println("Sorry,You Lost this Round");
                System.out.println("Your Current Balance is : "+ balance);
            }
            if(balance == 0)
            {
                System.out.println("Sorry,Your Balance is Zero.Please recharge\n All the best for the next game,Bye");
            }


        }
    }

    private static int getpayOut(String[] row, int bet) {
        if(row[0].equals(row[1]) && row[1].equals(row[2]))
        {
            return switch (row[0]){
                case "⭐" -> bet*2;
                case "🍋" -> bet*3;
                case "🍒" -> bet*4;
                case "🔔" -> bet*5;
                case "🍉" -> bet*10;

                default -> 0;
            };
        }
        if(row[0].equals(row[1]))
        {
            return switch (row[0]){
                case "⭐" -> bet*1;
                case "🍋" -> bet*2;
                case "🍒" -> bet*2;
                case "🔔" -> bet*3;
                case "🍉" -> bet*4;

                default -> 0;
            };
        }
        if(row[1].equals(row[2]))
        {
            return switch (row[1]){
                case "⭐" -> bet*1;
                case "🍋" -> bet*2;
                case "🍒" -> bet*2;
                case "🔔" -> bet*3;
                case "🍉" -> bet*4;

                default -> 0;
            };
        }



        return 0;
    }

    static String[] spinRow() {
        String[] Symbols = {"🍉","🔔","🍒","⭐","⭐"};
        String[] row = new String[3];
        Random random = new Random();
        for(int i=0;i<3;i++)
        {
            row[i] = Symbols[random.nextInt(Symbols.length)];
        }
        return row;
    }
     static String printRow(String[] row)
    {
        System.out.println("**********************");
        System.out.println(" "+ String.join(" | ",row));
        System.out.println("**********************");

        return " ";

    }
}
















