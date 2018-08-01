package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TaskSumOfPositiveFromArray {
    public static void main(String[] args) {

        int[] numbers = {5, -505, 0, -9, 1};

        System.out.println(sum(numbers));

        SolutionTest test = new SolutionTest();
        test.testSumOfPositiveNumbersFromArray();
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            if (i >= 1) sum += i;
        }
        return sum;
    }

    public static class SolutionTest {
        @Test
        public void testSumOfPositiveNumbersFromArray() {
            assertEquals(25, TaskSumOfPositiveFromArray.sum(new int[]{5, 10, 10}));
            System.out.println("test with all positive numbers is passed");

            assertEquals(30, TaskSumOfPositiveFromArray.sum(new int[]{10, -15, 5, 2, 3, 10}));
            System.out.println("test with one negative and other positive numbers is passed");

            assertEquals(0, TaskSumOfPositiveFromArray.sum(new int[]{}));
            System.out.println("test without numbers is passed");

            assertEquals(0, TaskSumOfPositiveFromArray.sum(new int[]{-1, -100, -34}));
            System.out.println("test with all negative numbers is passed");
        }
    }
}
