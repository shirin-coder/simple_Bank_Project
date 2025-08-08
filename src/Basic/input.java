package Basic;

import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name: ");
        String name = input.nextLine();

        System.out.print("enter your age: ");
        int age = input.nextInt();
        System.out.println("Hello "+name);
        System.out.println("you are "+ age + "years old");

        input.close();
    }
}
