package TemplateMethod;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber extends Game {

    private Scanner scanner;
    private int numberToGuess;
    private int guess;
    private int tries;


    @Override
    void initializeGame() {
        System.out.println("Guess the number between 1 and 100");
        numberToGuess = new Random().nextInt(100) + 1;
        tries = 0;
        scanner = new Scanner(System.in);

    }

    @Override
    void makePlay(int player) {
        guess = scanner.nextInt();
        if (guess == numberToGuess) {
            System.out.println("You guessed the number!");
        } else if (guess < numberToGuess) {
            System.out.println("Your guess is too low");
        } else {
            System.out.println("Your guess is too high");
        }
        tries++;
    }

    @Override
    boolean endOfGame() {
        return guess == numberToGuess;
    }

    @Override
    void printWinner() {
        System.out.println("You guessed the number in " + tries + " turns.\n");
    }
}
