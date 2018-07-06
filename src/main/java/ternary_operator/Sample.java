package ternary_operator;

import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {

        System.out.println("Enter your ID number please ");
        Scanner scan = new Scanner(System.in);
        int id = scan.nextInt();
        double price;
        String person;
        if (id > 1001 && id < 55000) {
            price = 2.0;
            person = "student";
        } else {
            price = 3.0;
            person = "personal";
        }
        System.out.println("Price for " + person + " is " + price);


        System.out.println("Enter your ID number please ");
        Scanner scanner = new Scanner(System.in);
        int ids = scanner.nextInt();

        double sum = (ids > 1000 && ids < 55000) ? 2.0 : 3.0;
        System.out.println("Price for you are " + sum);

    }
}
