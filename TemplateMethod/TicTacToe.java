package TemplateMethod;

import java.util.Scanner;

public class TicTacToe extends Game {

    private char[][] board;
    private static final int BOARD_SIZE = 3;
    private static final char PLAYER_X = '❌';
    private static final char PLAYER_O = '⭕';
    private static final char EMPTY_SLOT = '⬜';
    private char currentPlayer;
    private Scanner scanner;


    @Override
    void initializeGame() {
        board = new char[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = EMPTY_SLOT;
            }
        }
        currentPlayer = PLAYER_X;
        scanner = new Scanner(System.in);
    }

    @Override
    void makePlay(int player) {
        System.out.println("Current board:");
        printBoard();
        System.out.println("Player " + currentPlayer + " turn.");
        int row, col;
        do {
            System.out.println("Enter row and column (0-2): ");

            row = scanner.nextInt();
            col = scanner.nextInt();

        } while (!isValidMove(row, col));
        board[row][col] = currentPlayer;
        if (hasWinner()) return;
        if (currentPlayer == PLAYER_X) {
            currentPlayer = PLAYER_O;
        } else {
            currentPlayer = PLAYER_X;
        }
    }

    @Override
    boolean endOfGame() {
        return isBoardFull() || hasWinner();
    }

    @Override
    void printWinner() {
        System.out.println("Final board:");
        printBoard();
        if (hasWinner()) {
            System.out.println("Player " + currentPlayer + " wins!");
        } else {
            System.out.println("It's a tie!");
        }
    }

    private void printBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private boolean isValidMove(int row, int col) {
        if (row < 0 || row >= BOARD_SIZE || col < 0 || col >= BOARD_SIZE) {
            return false;
        }
        return board[row][col] == EMPTY_SLOT;
    }

    private boolean isBoardFull() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j] == EMPTY_SLOT) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean hasWinner() {
        // check rows
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != EMPTY_SLOT) {
                return true;
            }
        }

        // check columns
        for (int i = 0; i < BOARD_SIZE; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != EMPTY_SLOT) {
                return true;
            }
        }

        // check diagonals
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != EMPTY_SLOT) {
            return true;
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != EMPTY_SLOT) {
            return true;
        }

        return false;
    }

}

