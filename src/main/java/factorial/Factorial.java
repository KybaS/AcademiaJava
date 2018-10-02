package factorial;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Factorial {
    static long factorial(long number) {
        long num = 1;
        long res = 1;

        if (number >= 1) {
            for (int i = 0; i < number; i++) {
                res = res * num++;
            }
        } else if (number == 0) {
            res = 1;
        } else {
            res = 0;
        }
        return res;
    }

    @Test
    public void testFactorial() {
        assertEquals(3628800, factorial(10));
        System.out.println("factorial from 10 should be 3628800, checked");

        assertEquals(6, factorial(3));
        System.out.println("factorial from 3 should be 6, checked!");

        assertEquals(1, factorial(0));
        System.out.println("factorial for 0 always 1, checked!");

        assertEquals(0, factorial(-100));
        System.out.println("this method return 0 for negative number, checked!");
    }
}
