package ChainOfResponsibility;

public class Palkankorotuspyyntö {
    private double palkankorotus;
    private Työntekijä työntekijä;

    public Palkankorotuspyyntö(double palkankorotus, Työntekijä työntekijä) {
        this.palkankorotus = palkankorotus;
        this.työntekijä = työntekijä;
    }

    public double getPalkankorotus() {
        return palkankorotus;
    }

    public Työntekijä getTyöntekijä() {
        return työntekijä;
    }
}
