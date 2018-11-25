package fibonacci_numbers;

public class Fibonacci {
    public static void main(String[] args) {

        int repeat = 20, firstNum = 1, secondNum = 1;
        int i;
        System.out.println("Fibonacci numbers: ");

        System.out.print(firstNum + " " + secondNum);

        for (i = 3; i < repeat; i++) {
            secondNum = firstNum + secondNum;
            firstNum = secondNum - firstNum;
            System.out.print(" " + secondNum);
        }
    }
}
