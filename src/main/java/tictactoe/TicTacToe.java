package tictactoe;

import java.util.Scanner;

public class TicTacToe {

    private static final String EMPTY_CELL = "   ", X = " X ", O = " 0 ";
    private static final int ROWS = 3, COLUMNS = 3;
    private static String activePlayer;
    private static String[][] playingField = new String[ROWS][COLUMNS];
    private static int gameStatus;
    private static final int GAME_STATUS_CONTINUES = 0, GAME_STATUS_DRAW = 1, GAME_STATUS_VICTORY_X = 3, GAME_STATUS_VICTORY_0 = 4;
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        startGame();
        do {
            getEnteredData();
            reviewFields();
            printAllCells();
            if (gameStatus == GAME_STATUS_VICTORY_X) {
                System.out.println("X won! Congratulations!");
            } else if (gameStatus == GAME_STATUS_VICTORY_0) {
                System.out.println("0 won! Congratulations!");
            } else if (gameStatus == GAME_STATUS_DRAW) {
                System.out.println("The game ended in a draw");
            }

            activePlayer = (activePlayer == X ? O : X);
        }
        while (gameStatus == GAME_STATUS_CONTINUES);
    }

    private static void startGame() {
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                playingField[row][column] = EMPTY_CELL;
            }
        }
        activePlayer = X;
        printAllCells();
    }

    private static void getEnteredData() {
        boolean correctInput = false;

        do {
            System.out.print("Player " + activePlayer + ", enter row (1-3 and column (1-3) through space: ");
            int row = input.nextInt() - 1;
            int column = input.nextInt() - 1;

            if (row >= 0 && row < ROWS && column >= 0 && column < COLUMNS && playingField[row][column] == EMPTY_CELL) {
                playingField[row][column] = activePlayer;
                correctInput = true;
            } else {
                System.out.println("Selected placing (" + (row + 1) + "," + (column + 1) + ") can't be used. Try again ...");
            }
        } while (!correctInput);
    }

    private static void reviewFields() {
        String winner = findWinner();
        if (winner.equals(X)) {
            gameStatus = GAME_STATUS_VICTORY_X;
        } else if (winner.equals(O)) {
            gameStatus = GAME_STATUS_VICTORY_0;
        } else if (areAllCellsFilled()) {
            gameStatus = GAME_STATUS_DRAW;
        } else {
            gameStatus = GAME_STATUS_CONTINUES;
        }
    }

    private static boolean areAllCellsFilled() {
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                if (playingField[row][column] == EMPTY_CELL) {
                    return false;
                }
            }
        }
        return true;
    }

    private static String findWinner() {
        int numberOfMatches;
        for (int row = 0; row < ROWS; row++) {
            numberOfMatches = 0;
            for (int column = 0; column < COLUMNS; column++) {
                if (playingField[row][0] != EMPTY_CELL && playingField[row][0] == playingField[row][column]) {
                    numberOfMatches++;
                }
            }
            if (numberOfMatches == 3) {
                return playingField[row][0];
            }
        }

        for (int column = 0; column < COLUMNS; column++) {
            numberOfMatches = 0;
            for (int row = 0; row < ROWS; row++) {
                if (playingField[0][column] != EMPTY_CELL && playingField[0][column] == playingField[row][column]) {
                    numberOfMatches++;
                }
            }
            if (numberOfMatches == 3) {
                return playingField[0][column];
            }
        }
        if (playingField[0][0] != EMPTY_CELL && playingField[0][0] == playingField[1][1] && playingField[0][0] == playingField[2][2]) {
            return playingField[0][0];
        }

        if (playingField[0][2] != EMPTY_CELL && playingField[0][2] == playingField[1][1] && playingField[0][2] == playingField[2][0]) {
            return playingField[0][2];
        }

        return EMPTY_CELL;
    }

    private static void printAllCells() {
        for (int row = 0; row < ROWS; row++) {
            for (int column = 0; column < COLUMNS; column++) {
                System.out.print(playingField[row][column]);
                if (column != COLUMNS - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (row != ROWS - 1) {
                System.out.println("-----------");
            }
        }
        System.out.println();
    }
}
