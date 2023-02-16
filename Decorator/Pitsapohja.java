package Decorator;

public class Pitsapohja implements Pitsa {

    private String pitsa;
    private double hinta;

    public Pitsapohja() {
        this.pitsa = "Pitsapohja";
        this.hinta = 9.90;
    }
    public String getPitsa() {
        return pitsa;
    }

    public double getHinta() {
        return hinta;
    }
}
