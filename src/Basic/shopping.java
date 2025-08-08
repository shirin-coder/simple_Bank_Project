package Basic;

import java.util.Scanner;

public class shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What item would you like to buy: ");

        item = input.nextLine();
        System.out.print("What is the price of each?: ");
        price = input.nextDouble();

        System.out.print("How many would you like? ");
        quantity = input.nextInt();

        total = price * quantity;
        System.out.println("\nYou have bought "+ quantity + " " + item + "/s" );
        System.out.println("Your total is: " + currency + total);

        input.close();

    }
}
