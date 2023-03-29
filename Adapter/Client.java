package Adapter;

public class Client {
    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target adapter = new Adapter(adaptee);


        System.out.println("Adapter getData(): \n" + adapter.getData());

        adapter.setData("""
                Code complete, relief
                Adapter pattern now clear
                Haiku, a tribute""");
        System.out.println("\nAdapter after setData(): \n" + adapter.getData());

    }
}
