package Prototype;

public class Main {
    public static void main(String[] args) {
        Kello kello1 = new Kello();
        Kello kello2 = kello1.clone(); // syväkopio

        for (int i = 0; i < 43199; i++) { // 43199s = 11h 59min 59s
            kello1.tikita();
        }
        System.out.println("kello1 " + kello1.getAika()); // 11:59:59
        System.out.println("kello2 " + kello2.getAika()); // 12:00:00 eli 00:00:00
    }
}
