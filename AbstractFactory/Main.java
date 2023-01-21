package AbstractFactory;

import java.util.Scanner;
import AbstractFactory.Vaatetus.AbstraktiVaatetus;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        AbstraktiVaatetus vaatetus;

        vaatetus = Vaatekaappi.getVaatetus("Adidas");
        vaatetus.VaatteetVaihtoon();
        System.out.println(vaatetus.toString());

        vaatetus = Vaatekaappi.getVaatetus("Boss");
        vaatetus.VaatteetVaihtoon();
        System.out.println(vaatetus.toString());


        // Bonus

        // scan terminal input for a string
        System.out.println("Enter a brand name (Adidas or Boss): ");
        String merkki = new Scanner(System.in).nextLine();
        System.out.println("You entered: " + merkki);

        // use java reflection api to change the name of the class
        // to the string entered in the terminal
        // it can either be AdidasVaatetus or BossVaatetus
        // if it is not one of those, it will throw an exception
        try {
            Class<?> c = Class.forName("AbstractFactory." + merkki + "." + merkki + "Vaatetus");
            vaatetus = (AbstraktiVaatetus) c.newInstance();
            vaatetus.VaatteetVaihtoon();
            System.out.println(vaatetus.toString());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }


    }
}