package arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] array = {4, 7, 5, 2, 10, 5, 100};

        sortAndPrint(array);

        bubbleSort(array);

    }

    public static void sortAndPrint(int[] m) {
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));

        for (int i = m.length - 1; i > 0; i--) {
            System.out.print(m[i] + " ");
            System.out.print("");
        }
    }

    public static void bubbleSort(int[] m) {
        int repeat = 0;
        boolean replacement = true;

        while (replacement) {
            replacement = false;
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i] > m[i + 1]) {
                    int tmp = m[i];
                    m[i] = m[i + 1];
                    m[i + 1] = tmp;
                }
            }
            repeat++;
        }
        for (int i : m) {
            System.out.print(i + "\t");
        }
    }
}
