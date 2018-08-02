package kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class BooleanToString {
    public static void main(String[] args) {

        System.out.println(booleanToString(false));
        System.out.println(booleanToString(true));

        System.out.println(isThisTriangle(10,0,30));

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

    public static class UnitTestMyMethods {
        @Test
        public void testBoolToString() {
            assertEquals(BooleanToString.booleanToString(true), "Yes");
            System.out.println("boolean true == String yes");

            assertEquals(BooleanToString.booleanToString(false), "No");
            System.out.println("boolean false == String no");
        }

        @Test
        public void testIsThisTriangle(){
            assertTrue(isThisTriangle(3, 4, 6));
            System.out.println("Positive test is passed");

            assertFalse(isThisTriangle(9, -5, 4));
            System.out.println("negative test with [-] is passed");

            assertFalse(isThisTriangle(0, 5, 100));
            System.out.println("negative test with zero is passed");
        }
    }
}
