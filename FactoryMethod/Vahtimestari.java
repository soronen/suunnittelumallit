package FactoryMethod;

public class Vahtimestari extends AterioivaOtus {

    public Juoma createJuoma() {
        return new Energiajuoma();
    }
}
