package Decorator.täytteet;

import Decorator.Pitsa;
import Decorator.TäytteellinenPitsa;

public class MozzarellaDecorator extends TäytteellinenPitsa {
private Pitsa pitsa;
    private double hinta;

    public MozzarellaDecorator(Pitsa pitsa) {
        super(pitsa);
        this.pitsa = pitsa;
        this.hinta = 2.00;
    }

    public String getPitsa() {
        return pitsa.getPitsa() + " + mozzarella";
    }

    public double getHinta() {
        return pitsa.getHinta() + hinta;
    }
}
