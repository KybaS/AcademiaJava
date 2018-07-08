package for_loop;

import java.util.Scanner;

public class ReverseText {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter some text: ");
        String text = scan.nextLine();

        for (int i = text.length() - 1; i >= 0;  i--) {
            System.out.print(text.substring(i , i +1));
        }
    }
}
