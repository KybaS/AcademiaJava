package kata;

import java.util.Arrays;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyMethodsWithUnitTests {

    public static void main(String[] args) {

        int[] array = {2, 13, 45, 0, 1000, -9};

        System.out.println(booleanToString(false));
        System.out.println(booleanToString(true));

        System.out.println(isThisTriangle(10, 0, 30));

        reversedSequence(10);

        System.out.println(switchItUp(7));

        UnitTestMyMethods unitTestMyMethods = new UnitTestMyMethods();
        unitTestMyMethods.testBoolToString();
        unitTestMyMethods.testIsThisTriangle();
        unitTestMyMethods.testMinMaxFromArray();

        System.out.println(Arrays.toString(minMax(array)));
    }

    private static int[] minMax(int[] array) {
        int max = array[0];
        int min = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
            if (min > i){
                min = i;
            }
        }
        return new int[]{min, max};
    }

    private static String booleanToString(boolean YesNo) {

        // return YesNo ? "Yes" : "No";

        String yes = "Yes";
        String no = "No";
        if (YesNo) {
            return yes;
        } else {
            return no;
        }
    }

    private static boolean isThisTriangle(int a, int b, int c) {
        return a + b > c && a + c > b && b + c > a;
    }

    private static void reversedSequence(int n) {
        for (int i = 0; i < n; i++) {
            int res = n--;
            System.out.println(res);
            i--;
        }
    }

    private static String switchItUp(int number) {
        String output = null;
        switch (number) {
            case 0:
                output = "Zero";
                break;
            case 1:
                output = "One";
                break;
            case 2:
                output = "Two";
                break;
            case 3:
                output = "Three";
                break;
            case 4:
                output = "Four";
                break;
            case 5:
                output = "Five";
                break;
            case 6:
                output = "Six";
                break;
            case 7:
                output = "Seven";
                break;
            case 8:
                output = "Eight";
                break;
            case 9:
                output = "Nine";
                break;
        }
        return output;
    }

    public static class UnitTestMyMethods {
        @Test
        public void testBoolToString() {
            assertEquals(MyMethodsWithUnitTests.booleanToString(true), "Yes");
            System.out.println("boolean true == String yes");

            assertEquals(MyMethodsWithUnitTests.booleanToString(false), "No");
            System.out.println("boolean false == String no");
        }

        @Test
        public void testIsThisTriangle() {
            assertTrue(isThisTriangle(3, 4, 6));
            System.out.println("Positive test is passed");

            assertFalse(isThisTriangle(9, -5, 4));
            System.out.println("negative test with [-] is passed");

            assertFalse(isThisTriangle(0, 5, 100));
            System.out.println("negative test with zero is passed");
        }

        @Test
        public void testSwitchItUp() {
            assertEquals(switchItUp(3), "Three");
            assertEquals(switchItUp(0), "Zero");
            assertFalse(switchItUp(11), false);
        }

        @Test
        public void testMinMaxFromArray(){
            assertArrayEquals(new int[]{5, 777}, MyMethodsWithUnitTests.minMax(new int[] {7, 5, 33, 777, 567, 10}));
            System.out.println("test with min: 5 and max: 777 is passed");

            assertArrayEquals(new int[]{-45, 555}, MyMethodsWithUnitTests.minMax(new int[] {456, 5, 7, 555, 0, -45, -4}));
            System.out.println("test with min: -45 and max: 555 is passed");
        }
    }
}
