package ChainOfResponsibility;

public class Lähimies extends Handler {
    private Handler successor;

    public Lähimies(Handler s) {
        super(s);
    }

    @Override
    public void handle(Palkankorotuspyyntö p) {
        if (p.getPalkankorotus() <= 0.02) {
            System.out.println("Lähimies hyväksyy palkankorotuksen " + p.getPalkankorotus() + "%");
            p.getTyöntekijä().setPalkka(p.getTyöntekijä().getPalkka() * (1 + p.getPalkankorotus()));
            return;
        }
        super.handle(p);
    }

    public void setSuccessor(Handler s) {
        successor = s;
    }
}
