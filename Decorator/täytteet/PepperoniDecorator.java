package Decorator.täytteet;

import Decorator.Pitsa;
import Decorator.TäytteellinenPitsa;

public class PepperoniDecorator extends TäytteellinenPitsa {
    private Pitsa pitsa;
    private double hinta;

    public PepperoniDecorator(Pitsa pitsa) {
        super(pitsa);
        this.pitsa = pitsa;
        this.hinta = 1.00;
    }

    public String getPitsa() {
        return pitsa.getPitsa() + " + mozzarella";
    }

    public double getHinta() {
        return pitsa.getHinta() + hinta;
    }
}