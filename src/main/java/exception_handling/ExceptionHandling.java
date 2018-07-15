package exception_handling;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        System.out.println("Enter your favorite number: ");
        Scanner scan = new Scanner(System.in);
        if (scan.hasNextInt()) {
            int num = scan.nextInt();
            System.out.println("Your favorite number is - " + num);
        } else {
            System.out.println("The wrong symbol was entered");
        }

        try {
            System.out.println("Enter your favorite number: ");
            Scanner scan1 = new Scanner(System.in);
            int num = scan1.nextInt();
            System.out.println("Your favorite number is - " + num);
        } catch (Exception e) {
            System.out.println("The wrong symbol was entered ");
        }
    }
}
