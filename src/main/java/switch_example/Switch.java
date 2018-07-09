package switch_example;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        System.out.print("Enter one English letter and this program recognized vowel or consonant sounds has this letter: ");
        String letter;
        Scanner scan = new Scanner(System.in);
        letter = scan.nextLine();

        switch (letter.toUpperCase()) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
                System.out.println("English letters: A, E, I, O, U transmit vowel sounds.");
                break;
            case "B":
            case "C":
            case "D":
            case "F":
            case "G":
            case "H":
            case "J":
            case "K":
            case "L":
            case "M":
            case "N":
            case "P":
            case "Q":
            case "R":
            case "S":
            case "T":
            case "V":
            case "W":
            case "X":
            case "Y":
            case "Z":
                System.out.println("English letters: B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, W, X, Y, Z transmit consonant sounds.");
                break;
            default:
                System.out.println("The incorrect data were entered");
                break;
        }
    }
}
