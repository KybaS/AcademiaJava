package average_of_numbers;

import java.util.Scanner;

public class Average extends SubClass{
    public static void main(String[] args) {

        //first trying
        double firstNumber;
        double secondNumber;
        double thirdNumber;
        double fourthNumber;

        System.out.println("Enter four numbersRand for calculating average: ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number -   ");
        firstNumber = scanner.nextDouble();

        System.out.print("Enter second number -  ");
        secondNumber = scanner.nextDouble();

        System.out.print("Enter third number -   ");
        thirdNumber = scanner.nextDouble();

        System.out.print("Enter fourth number -  ");
        fourthNumber = scanner.nextDouble();

        System.out.print("Average = ");

        SubClass firstRes = new SubClass(firstNumber, secondNumber, thirdNumber, fourthNumber);


        //second trying
        System.out.println("Enter three numbersRand for calculating average: ");

        Scanner scanners = new Scanner(System.in);

        System.out.print("Enter first number -  ");
        double numberOne = scanners.nextDouble();

        System.out.print("Enter second number - ");
        double numberTwo = scanners.nextDouble();

        System.out.print("Enter third number -  ");
        double numberThree = scanners.nextDouble();

        System.out.print("Average = ");

        SubClass secondRes = new SubClass(numberOne, numberTwo, numberThree);

        //third trying
        Scanner thirdScan = new Scanner(System.in);
        String enter = "0.0";
        double numbers, suma = 0;
        int amount_of_numbers = 0;

        while (!enter.equals("STOP")) {
            numbers = Double.parseDouble(enter);
            suma = suma + numbers;
            System.out.println("Enter number, or [STOP] for finish: ");
            enter = thirdScan.nextLine();
            amount_of_numbers++;

        }
        double average = suma / --amount_of_numbers;
        System.out.println("Average = " + average + " with " + amount_of_numbers + " numbersRand");

    }
}
