package arrays.comparison_arrays;

public class MethodsForComparison {
    public void matchOfTwoArrays(int[] first, int[] second) {

        if (first.length == second.length) {
            int m = 0;
            int d = 0;
            int count = 1;
            for (int i = 0; i < first.length; i++) {
                if (first[i] == second[i]) {
                    m++;
                    System.out.println(count++ + ") " + first[i] + " match with " + second[i]);
                } else {
                    d++;
                    System.out.println(count++ + ") " + first[i] + " doesn't match with " + second[i]);
                }
            }

            if (m + 1 == count) {
                System.out.println("Arrays are the same");
            } else if (m != count) {
                System.out.println("Match " + m);
                System.out.println("Doesn't match " + d);
            }

        } else {
            System.out.println("Different length of arrays");
        }
    }

    public void matchOfTwoArrays(String[] first, String[] second) {

        if (first.length == second.length) {
            int m = 0;
            int d = 0;
            int count = 1;
            for (int i = 0; i < first.length; i++) {
                if (first[i] == second[i]) {
                    m++;
                    System.out.println(count++ + ") " + first[i] + " match with " + second[i]);
                } else {
                    d++;
                    System.out.println(count++ + ") " + first[i] + " doesn't match with " + second[i]);
                }
            }

            if (m + 1 == count) {
                System.out.println("Arrays are the same");
            } else if (m != count) {
                System.out.println("Match " + m);
                System.out.println("Doesn't match " + d);
            }

        } else {
            System.out.println("Different length of arrays");
        }
    }
}
