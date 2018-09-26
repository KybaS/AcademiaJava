package it_proger;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayWithLoop {
    public static void main(String[] args) {

        int[] arr = new int[]{5, 45, 9, 7};

        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }

        int[][] array = new int[][]{
                {23, 8, 45, 89},
                {4, 23, 9, 4},
                {55, 90, 12, 44}
        };

        for (int i = 0; i < 3; i++) {
            for (int x = 0; x < 3; x++) {
                System.out.println(array[i][x]);
            }
        }

        ArrayList<Integer> myArray = new ArrayList<>(1);
        myArray.add(9);
        myArray.add(67);
        myArray.add(44);


        for (Integer a : myArray) {
            System.out.print(a + " ");
        }

        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("John");
        System.out.println(" ");
        for (String x : names) {
            System.out.println(x);
        }

        int arrayX[] = {0, 1, 2};

        try {
            System.out.println(arrayX[1]);
            int c = 100 / 2;
        } catch (ArithmeticException e) {
            System.out.println("ERROR - " + e);
        } catch (Exception e) {
            System.out.println("ERROR - " + e);
        } finally {
            System.out.println("Finally is working");
        }
    }
}
