package FactoryMethod;

public class Opiskelija extends AterioivaOtus {

    @Override
    public Juoma createJuoma() {
        return new Maito();
    }
}
