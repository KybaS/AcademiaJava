package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

        int[] array = {1000, 7, -9, 5, 10, 5, 100, 0, 234, 767};

        //sortAndPrint(array);
        //bubbleSort(array);

        bubbleSortPlus(array);
        System.out.println(" ");

        evenOddSort(array);
        System.out.println(" ");

        System.out.println("Array sum: "+displaySumOfArray(array));
    }

    private static void evenOddSort(int[] numbers){
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();

        for (int num:numbers){
            if (num % 2 == 0){
                evenList.add(num);
            }else {
                oddList.add(num);
            }
        }

        System.out.print("Even numbers from array: ");

        for (int even:evenList){
            System.out.print(even + " ");
        }

        System.out.println(" ");
        System.out.print("Odd numbers from array:  ");

        for (int odd:oddList){
            System.out.print(odd + " ");
        }
    }

    private static int displaySumOfArray(int[] numbers){
        int sum = 0;
        for (int i:numbers){
            sum+=i;
        }
        return sum;
    }

    private static void sortAndPrint(int[] m) {
        Arrays.sort(m);
        System.out.println(Arrays.toString(m));

        for (int i = m.length - 1; i > 0; i--) {
            System.out.print(m[i] + " ");
            System.out.print("");
        }
    }

    private static void bubbleSortPlus(int[] array){
        int length = array.length;

        System.out.print("Original array data:       ");

        for (int num:array){
            System.out.print(num + " ");
        }

        System.out.println(" ");

        for (int i = 1; i < length; i++) {
            for (int j = i; (j >= 1) && (array[j] < array[j - 1]); j--) {
                int a = array[j];
                array[j] = array[j - 1];
                array[j - 1] = a;
            }
        }

        System.out.print("Data after bubble sorting: ");

        for (int myArray : array) {
            System.out.print(myArray + " ");
        }
    }

    private static void bubbleSort(int[] m) {
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
