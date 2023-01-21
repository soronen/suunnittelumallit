package AbstractFactory;

import AbstractFactory.Adidas.AdidasVaatetus;
import AbstractFactory.Boss.BossVaatetus;
import AbstractFactory.Vaatetus.AbstraktiVaatetus;

public class Vaatekaappi {

    public static AbstraktiVaatetus getVaatetus(String merkki) {

        switch(merkki){
            case "Adidas":
                return new AdidasVaatetus();
            case "Boss":
                return new BossVaatetus();
            default:
                System.out.println("Invalid brand");
                return null;
        }
    }

}
