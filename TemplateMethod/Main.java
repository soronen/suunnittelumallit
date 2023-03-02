package TemplateMethod;

public class Main {
    public static void main(String[] args) {


        Game guessTheNumber = new GuessTheNumber();
        guessTheNumber.playOneGame(1);

        Game TicTacToe = new TicTacToe();
        TicTacToe.playOneGame(2);

    }
}
