package Composite;

public class Main {
    public static void main(String[] args) {

        PCBuilder pcBuilder = new CheapPCBuilder();
        Composite cheapPC = pcBuilder.PCBuilder();

        System.out.println(cheapPC.toString());
        System.out.println(cheapPC.getPrice());

        pcBuilder = new ExpensivePCBuilder();
        Composite expensivePC = pcBuilder.PCBuilder();

        System.out.println(expensivePC.toString());
        System.out.println(expensivePC.getPrice());


    }
}
