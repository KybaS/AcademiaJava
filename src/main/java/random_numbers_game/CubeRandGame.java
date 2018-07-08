package random_numbers_game;

import java.util.Random;
import java.util.Scanner;

public class CubeRandGame {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Random cube = new Random();
        int cube_num;
        int user_num;
        int num_of_attempts = 0;

        do {
            System.out.print("Enter your number within (1-6): ");
            user_num = scan.nextInt();
            cube_num = 1 + cube.nextInt(6);
            System.out.println("On the cube fell out: " + cube_num);
            num_of_attempts++;
        } while (cube_num != user_num);
        System.out.println("*****************************");
        System.out.println("Congratulations! You guessed the number for " + num_of_attempts + " attempts");
    }
}
