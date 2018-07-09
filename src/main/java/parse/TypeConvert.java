package parse;

import java.util.Scanner;

public class TypeConvert {
    public static void main(String[] args) {

        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("float: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);


        //String
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some text to get a length of this text: ");
        String text = scan.nextLine();
        int lengthOfText = text.length();

        outputData(text, lengthOfText);

    }

    private static void outputData(String text, int lengths) {
        System.out.println(text.toUpperCase() + " has " + lengths + " length");
        if (text.contains("son of bitch")) {
            System.out.println("bad word");
        } else {
            System.out.println("ok");
        }
    }
}
