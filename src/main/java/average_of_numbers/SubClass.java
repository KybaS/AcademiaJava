package average_of_numbers;

public class SubClass extends Average {

    SubClass() {
    }

    SubClass(double firstNumber, double secondNumber, double thirdNumber) {
        double result = (firstNumber + secondNumber + thirdNumber) / 3;
        System.out.println(result);
    }

    SubClass(double firstNumber, double secondNumber, double thirdNumber, double fourthNumber) {
        double result = (firstNumber + secondNumber + thirdNumber + fourthNumber) / 4;
        System.out.println(result);
    }

    void averageForFourNumbers(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber) {
        int result = (firstNumber + secondNumber + thirdNumber + fourthNumber) / 4;
        System.out.println(result);
    }
}
