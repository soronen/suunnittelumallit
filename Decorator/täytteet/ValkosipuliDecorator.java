package Decorator.täytteet;

import Decorator.Pitsa;
import Decorator.TäytteellinenPitsa;

public class ValkosipuliDecorator extends TäytteellinenPitsa {
    private Pitsa pitsa;
    private double hinta;

    public ValkosipuliDecorator(Pitsa pitsa) {
        super(pitsa);
        this.pitsa = pitsa;
        this.hinta = 1.00;
    }

    public String getPitsa() {
        return pitsa.getPitsa() + " + valkosipuli";
    }

    public double getHinta() {
        return pitsa.getHinta() + hinta;
    }
}
