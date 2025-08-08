package project;
import java.sql.SQLOutput;
import java.util.Scanner;
public class bank {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
//        declare variables
        double balance = 0;
        boolean isRunning = true;
        int choice;

//        display menu
        while(isRunning){
            System.out.println("**********");
            System.out.println("BANKING PROGRAM");
            System.out.println("************");
            System.out.println("1. Show balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*************");


            //        get and process users choice
            System.out.print("Enter your choice (1-4): ");
            choice = input.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance = balance + deposit();
                case 3 -> balance = balance - withDraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("INVALID!!");


            }
        }

        System.out.println("-----***----");
        System.out.println("Thank you!!!!");
        System.out.println("-----***----");
    }

//    show balance

    static void showBalance(double balance){
        System.out.printf("$%.2f\n",balance);
    }

//    deposit
    static double deposit(){
        double amount;
        System.out.print("Enter an amount to be deposited: ");
        amount = input.nextDouble();
        if(amount < 0){
            System.out.println("amount can't be negative");
            return 0;
        }
        else {
            return amount;
        }

    }

//    withdraw
    static double withDraw(double balance){
        double amount;
        System.out.print("Enter amount to be withdrawn: ");
        amount = input.nextDouble();
        if(amount > balance){
            System.out.println("INSUFFICIENT FUNDS!");
            return 0;
        }

        else if( amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }

        else{
            return amount;
        }

    }

}
