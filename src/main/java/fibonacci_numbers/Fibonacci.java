package fibonacci_numbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Fibonacci {

    public int fibonacci(int repeats) {
        int firstNum = 1, secondNum = 1;
        int i;

        if (repeats < 0) {
            System.out.println("Negative number isn't allowed");
        } else if (repeats == 0){
            System.out.println("Zero number isn't allowed");
        }
        else {

            System.out.println("Fibonacci numbers: ");

            System.out.print(firstNum + " " + secondNum);

            for (i = 3; i < repeats; i++) {
                secondNum = firstNum + secondNum;
                firstNum = secondNum - firstNum;
                System.out.print(" " + secondNum);
            }
        } return secondNum;
    }

    @Test
    public void testFibonacci(){
        assertEquals(34, fibonacci(10));
    }
}
