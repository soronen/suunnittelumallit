package ChainOfResponsibility;

public abstract class Handler {
    private Handler successor;

    public Handler(Handler s) {
        successor = s;
    }

    public void handle(Palkankorotuspyyntö p) {
        if (successor != null) {
            successor.handle(p);
        }
    }
}
