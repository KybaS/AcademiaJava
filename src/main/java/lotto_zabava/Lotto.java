package lotto_zabava;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
    public static void main(String[] args) {

        System.out.println("Enter 6 numbers via comma (from 1 to 54): ");
        Scanner scan = new Scanner(System.in);
        String string_numbers = scan.nextLine();
        scan.close();

        String[] arrayOfNumbers = string_numbers.split(",");

        int[] circulation = new int[6];
        Random rand = new Random();
        int num = 0;
        while (num != 6) {
            boolean existed_number = false;
            int this_num = rand.nextInt(54) + 1;
            for (int exist_number : circulation) {
                if (exist_number == this_num) {
                    existed_number = true;
                    break;
                }
            }
            if (!existed_number) {
                circulation[num++] = this_num;
            }
        }

        int num_of_matches = 0;
        for (int i = 0; i < arrayOfNumbers.length; i++) {
            int parsed_number = Integer.parseInt(arrayOfNumbers[i]);
            for (int win_num : circulation) {
                if (parsed_number == win_num) {
                    num_of_matches++;
                }
            }
        }
        String all_num = "";
        for (int pars_num : circulation) {
            all_num = all_num+ pars_num + ", ";
        }
        System.out.println("Number of matches " + all_num + " number of attempts " + num_of_matches);
    }
}
