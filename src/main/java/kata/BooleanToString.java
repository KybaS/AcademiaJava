package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanToString {
    public static void main(String[] args) {

        System.out.println(booleanToString(false));
        System.out.println(booleanToString(true));

        System.out.println(isThisTriangle(10, 0, 30));

        reversedSequence(100);

        System.out.println(switchItUp(7));

        UnitTestMyMethods unitTestMyMethods = new UnitTestMyMethods();
        unitTestMyMethods.testBoolToString();
        unitTestMyMethods.testIsThisTriangle();
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
            assertEquals(BooleanToString.booleanToString(true), "Yes");
            System.out.println("boolean true == String yes");

            assertEquals(BooleanToString.booleanToString(false), "No");
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
        public void testSwitchItUp(){
            assertEquals(switchItUp(3), "Three");
            assertEquals(switchItUp(0), "Zero");
            assertFalse(switchItUp(11), false);
        }
    }
}
