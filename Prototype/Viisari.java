package Prototype;

public class Viisari {

    private final Viisarintyyppi tyyppi;
    private int arvo;

    public Viisari(Viisarintyyppi tyyppi) {
        this.tyyppi = tyyppi;
    }

    public void tikita() {
        if (arvo < 59) {
            arvo++;
        } else {
            arvo = 0;
        }
    }

    public int getArvo() {
        if (tyyppi == Viisarintyyppi.TUNTIVIISARI) {
            if (arvo % 12 == 0) {
                return 12;
            }
            return arvo % 12;
        }
        return arvo;
    }

    public void setArvo(int arvo) {
        this.arvo = arvo;
    }

    public Viisarintyyppi getTyyppi() {
        return tyyppi;
    }
}
