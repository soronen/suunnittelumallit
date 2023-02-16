package Decorator.täytteet;

import Decorator.Pitsa;
import Decorator.TäytteellinenPitsa;

public class RucolanversoDecorator extends TäytteellinenPitsa {
    private Pitsa pitsa;
    private double hinta;

    public RucolanversoDecorator(Pitsa pitsa) {
        super(pitsa);
        this.pitsa = pitsa;
        this.hinta = 1.00;
    }

    public String getPitsa() {
        return pitsa.getPitsa() + " + Berlusconi";
    }

    public double getHinta() {
        return pitsa.getHinta() + hinta;
    }
}
