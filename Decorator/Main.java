package Decorator;

import Decorator.täytteet.*;

public class Main {
    public static void main(String[] args) {
        Pitsa mozzarellaPitsa = new RucolanversoDecorator(
                                new KirsikkatomaattiDecorator(
                                new MozzarellaDecorator(
                                new Pitsapohja())));
        System.out.println("Mozzarellapitsan sisältö: " + mozzarellaPitsa.getPitsa() + " " + mozzarellaPitsa.getHinta() + "e");

        Pitsa pepperoniPitsa =  new PepperoniDecorator(
                                new ValkosipuliDecorator(
                                new MozzarellaDecorator(
                                new Pitsapohja())));
        System.out.println("Pepperonipitsan sisältö: " + pepperoniPitsa.getPitsa() + " " + pepperoniPitsa.getHinta() + "e");

        Pitsa ankeaPitsa = new Pitsapohja();
        System.out.println("Ankean pitsan sisältö: " + ankeaPitsa.getPitsa() + " " + ankeaPitsa.getHinta() + "e");



    }
}
