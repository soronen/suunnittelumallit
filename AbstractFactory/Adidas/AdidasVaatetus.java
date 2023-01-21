package AbstractFactory.Adidas;

import AbstractFactory.Vaatetus.*;

public class AdidasVaatetus extends AbstraktiVaatetus {

    private Tpaita tpaita;
    private Kengät kengät;
    private Farkut farkut;
    private Lippis lippis;


    @Override
    public void VaatteetVaihtoon() {
        tpaita = new AdidasTpaita();
        kengät = new AdidasKengät();
        farkut = new AdidasFarkut();
        lippis = new AdidasLippis();
    }
    @Override
    public String toString() {
        return "Tällä hetkellä päälläni on: \n" +
                tpaita.toString() + "\n" +
                kengät.toString() + "\n" +
                farkut.toString() + "\n" +
                lippis.toString();
    }
}
