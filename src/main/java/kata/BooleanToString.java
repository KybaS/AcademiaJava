package kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BooleanToString {
    public static void main(String[] args) {

        System.out.println(booleanToString(false));
        System.out.println(booleanToString(true));

        BoolTest boolTest = new BoolTest();
        boolTest.testBoolToString();
    }

     private static String booleanToString(boolean YesNo){

        // return YesNo ? "Yes" : "No";

        String yes = "Yes";
        String no = "No";
        if (YesNo){
            return yes;
        }else {
            return no;
        }
    }

    public static class BoolTest{
        @Test
        public void testBoolToString(){
            assertEquals(BooleanToString.booleanToString(true), "Yes");
            System.out.println("boolean true == String yes");

            assertEquals(BooleanToString.booleanToString(false), "No");
            System.out.println("boolean false == String no");
        }
    }
}
