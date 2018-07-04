package while_test;

import java.util.Scanner;

public class WhileClass {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = 0;

        while (number != 7) {
            System.out.println("Enter number between 0 - 10");
            number = scan.nextInt();
        }
        System.out.println("Congratulations on your guessed number!");


        Scanner nextScan = new Scanner(System.in);
        String word = " ";

        while (!word.equals("tea")) {
            System.out.println("I want some tea!!! give me tea!!!");
            word = nextScan.nextLine();
        }
        System.out.println("Thank you for your attention and tea)");
    }
}
