package Memento;

public class Main {
    public static void main(String[] args) {

        Arvuuttaja arvuuttaja = new Arvuuttaja();

        int asiakasMaara = 5;
        for (int i = 0; i < asiakasMaara; i++) {
            new Thread(new Asiakas(arvuuttaja)).start();
        }
    }
}
