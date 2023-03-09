package Memento;

import java.util.Random;

public class Arvuuttaja {
    private final Random random = new Random();

    public Memento liityPeliin() {
        int number = random.nextInt(100) + 1;
        return new Memento(number);
    }

    public boolean arvaa(Memento memento, int guess) {
        return memento.getNumber() == guess;
    }
}
