package ChainOfResponsibility;

public class Työntekijä {

    private Handler esimies;
    private double palkka;

    public Työntekijä(Handler esimies, double palkka) {
        this.esimies = esimies;
        this.palkka = palkka;
    }

    public void pyydäPalkankorotusta(double palkankorotus) {
        Palkankorotuspyyntö p = new Palkankorotuspyyntö(palkankorotus, this);
        esimies.handle(p);
    }

    public void setPalkka(double palkka) {
        System.out.println("Palkka on nyt " + palkka + ". (ennen " + this.palkka + ")\n");
        this.palkka = palkka;
    }

    public double getPalkka() {
        return palkka;
    }
}
