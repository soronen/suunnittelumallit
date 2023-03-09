package Memento;

import java.util.Random;

public class Asiakas implements Runnable {
    private final Arvuuttaja arvuuttaja;
    private Memento memento;

    public Asiakas(Arvuuttaja arvuuttaja) {
        this.arvuuttaja = arvuuttaja;
    }

    @Override
    public void run() {
        memento = arvuuttaja.liityPeliin();

        int guess = 0;
        while (!arvuuttaja.arvaa(memento, guess)) {
            guess = arvaaLuku();
        }

        System.out.println("Asiakas arvasi oikein: " + guess);
    }

    private int arvaaLuku() {
        return new Random().nextInt(100) + 1;
    }
}
