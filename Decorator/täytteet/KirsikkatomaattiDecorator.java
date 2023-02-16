package Decorator.täytteet;

import Decorator.Pitsa;
import Decorator.TäytteellinenPitsa;

public class KirsikkatomaattiDecorator extends TäytteellinenPitsa {
    private Pitsa pitsa;
    private double hinta;

    public KirsikkatomaattiDecorator(Pitsa pitsa) {
        super(pitsa);
        this.pitsa = pitsa;
        this.hinta = 1.00;
    }

    public String getPitsa() {
        return pitsa.getPitsa() + " + pepperoni";
    }

    public double getHinta() {
        return pitsa.getHinta() + hinta;
    }
}
