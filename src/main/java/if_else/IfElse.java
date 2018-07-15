package if_else;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        int zp;

        System.out.println("Enter your salary for month: ");
        Scanner scan = new Scanner(System.in);
        zp = scan.nextInt();

        if (zp < 300) {
            System.out.println("You can use MARSHRUTKA");
        } else if (zp > 301 && zp < 999) {
            System.out.println("You can buy ROVER");
        } else if (zp > 1000 && zp < 14999) {
            System.out.println("You can buy TAVRIA");
        } else if (zp < 25000 && zp > 15000) {
            System.out.println("You can buy AUDI");
        } else {
            System.out.println("You can buy FERRARI");
        }
    }
}
