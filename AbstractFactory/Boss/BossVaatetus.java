package AbstractFactory.Boss;


import AbstractFactory.Vaatetus.*;

public class BossVaatetus extends AbstraktiVaatetus {

    private Tpaita tpaita;
    private Kengät kengät;
    private Farkut farkut;
    private Lippis lippis;

    @Override
    public void VaatteetVaihtoon() {
        tpaita = new BossTpaita();
        kengät = new BossKengät();
        farkut = new BossFarkut();
        lippis = new BossLippis();
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
