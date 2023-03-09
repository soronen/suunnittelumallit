package ChainOfResponsibility;

public class Yksikköpäällikkö extends Handler {
    private Handler successor;

    public Yksikköpäällikkö(Handler s) {
        super(s);
    }

    public void setSuccessor(Handler s) {
        successor = s;
    }

    @Override
    public void handle(Palkankorotuspyyntö p) {
        if (p.getPalkankorotus() < 0.05) {
            System.out.println("Yksikköpäällikkö hyväksyy palkankorotuksen " + p.getPalkankorotus() + "%");
            p.getTyöntekijä().setPalkka(p.getTyöntekijä().getPalkka() * (1 + p.getPalkankorotus()));
            return;
        }
        super.handle(p);
    }
}
