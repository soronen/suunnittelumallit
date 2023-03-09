package ChainOfResponsibility;

public class Toimitusjohtaja extends Handler {
    public Toimitusjohtaja(Handler s) {
        super(s);
    }

    @Override
    public void handle(Palkankorotuspyyntö p) {
        System.out.println("Toimitusjohtaja hyväksyy palkankorotuksen " + p.getPalkankorotus() + "%");
        p.getTyöntekijä().setPalkka(p.getTyöntekijä().getPalkka() * (1 + p.getPalkankorotus()));
    }
}
