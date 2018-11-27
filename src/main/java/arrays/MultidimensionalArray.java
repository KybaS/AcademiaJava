package arrays;

public class MultidimensionalArray {
    public static void main(String[] args) {

        int[][] twoDimensionalArray = {
                {4, 8, 5},
                {45, 765, 45, 3},
                {5, 1000}};

        System.out.println(twoDimensionalArray[2][1]);

        for (int row = 0; row < twoDimensionalArray.length; row++) {
            for (int column = 0; column < twoDimensionalArray[row].length; column++) {
                System.out.print(twoDimensionalArray[row][column] + " / ");
            }
        }

        System.out.println(" ");
        System.out.println(" ------------------- ");

        for (int[] array : twoDimensionalArray) {
            for (int data_from_array : array) {
                System.out.print(data_from_array + " / ");
            }
        }

        System.out.println(" ");
        System.out.println(" ------------------- ");

        for (int i = 0; i < twoDimensionalArray.length; i++) {
            int sum = 0;
            for (int num : twoDimensionalArray[i]) {
                sum = sum + num;
            }
            System.out.println("№ " + i + " result " + sum);
            System.out.println("average " + sum / twoDimensionalArray[i].length);
        }
    }
}