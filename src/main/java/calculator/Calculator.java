package calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner user_entered = new Scanner(System.in);
        double first_number, second_number, result = 0;
        String operation;

        System.out.println("Enter first number: ");
        first_number = Double.parseDouble(user_entered.nextLine());

        System.out.println("Which kind of operation do you want to execute? [+ - / *]");
        operation = user_entered.nextLine();

        System.out.println("Enter second number: ");
        second_number = Double.parseDouble(user_entered.nextLine());

        if (operation.equals("/") && second_number == 0) {
            System.out.println("You can't divide by zero");
            return;
        }

        if (operation.equals("+")) {
            result = first_number + second_number;
        } else if (operation.equals("-")) {
            result = first_number - second_number;
        } else if (operation.equals("/")) {
            result = first_number / second_number;
        } else if (operation.equals("*")) {
            result = first_number * second_number;
        } else {
            System.out.println("Were entered incorrect data!");
        }
        System.out.println("The result of the operation (" + operation + ") calculation is " + result);
    }
}
