package FactoryMethod;
public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus vahtimestari = new Vahtimestari();
        AterioivaOtus opiskelija = new Opiskelija();

        opettaja.aterioi();
        vahtimestari.aterioi();
        opiskelija.aterioi();
    }
}
