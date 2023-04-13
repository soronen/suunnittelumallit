package Prototype;

import java.util.Timer;
import java.util.TimerTask;

public class Kello implements Cloneable {

    private Viisari sekuntiviisari;
    private Viisari minuuttiviisari;
    private Viisari tuntiviisari;

    public Kello() {
        this.sekuntiviisari = new Viisari(Viisarintyyppi.SEKUNTIVIISARI);
        this.minuuttiviisari = new Viisari(Viisarintyyppi.MINUUTTIVIISARI);
        this.tuntiviisari = new Viisari(Viisarintyyppi.TUNTIVIISARI);
    }

    public void tikita() {
        sekuntiviisari.tikita();
        if (sekuntiviisari.getArvo() == 0) {
            minuuttiviisari.tikita();
            if (minuuttiviisari.getArvo() == 0) {
                tuntiviisari.tikita();
            }
        }
    }

    public String getAika() {
        return String.format("%02d:%02d:%02d", tuntiviisari.getArvo(), minuuttiviisari.getArvo(), sekuntiviisari.getArvo());
    }

    public void nollaa() {
        sekuntiviisari.setArvo(0);
        minuuttiviisari.setArvo(0);
        tuntiviisari.setArvo(0);
    }


    @Override
    public Kello clone() {
        try {
            Kello k = (Kello) super.clone();

            /* ilman näitä kopiointi ei ole syvä,
            eli kloonatut kellot jakavat viisarinsa prototypppinsä kanssa. */
            k.sekuntiviisari = new Viisari(sekuntiviisari.getTyyppi());
            k.sekuntiviisari.setArvo(this.sekuntiviisari.getArvo());

            k.minuuttiviisari = new Viisari(minuuttiviisari.getTyyppi());
            k.minuuttiviisari.setArvo(this.minuuttiviisari.getArvo());

            k.tuntiviisari = new Viisari(tuntiviisari.getTyyppi());
            k.tuntiviisari.setArvo(this.tuntiviisari.getArvo());


            return k;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
