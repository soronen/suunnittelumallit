package Decorator;

import Decorator.Pitsa;

public abstract class TäytteellinenPitsa implements Pitsa {

    private Pitsa pitsa;

    public TäytteellinenPitsa(Pitsa pitsa) {
        this.pitsa = pitsa;
    }

    public String getPitsa() {
        return pitsa.getPitsa();
    }

    public double getHinta() {
        return pitsa.getHinta();
    }

}
