package methods_with_return;

import java.util.Scanner;

public class MethodsWithParam {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name - ");
        String name = scan.nextLine();

        System.out.print("Enter your age - ");
        int age = scan.nextInt();

        double my_weight = 76.8;
        final int MY_FAVORITE_NUMBER = 9;

        sayHello(name, age, my_weight, MY_FAVORITE_NUMBER);

    }

    private static void sayHello(String name, int age, double weight, int favorite_number){
        System.out.println("Hello, " + name + " (" + age + ") " + "with weight " + weight + " and favorite number " + favorite_number);
    }
}
