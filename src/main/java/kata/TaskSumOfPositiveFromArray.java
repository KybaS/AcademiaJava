package kata;

public class TaskSumOfPositiveFromArray {
    public static void main(String[] args) {

        int[] numbers = {5, -505, 0, -9, 1};

        System.out.println(sum(numbers));
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            if (i >= 1) sum += i;
        }
        return sum;
    }
}
