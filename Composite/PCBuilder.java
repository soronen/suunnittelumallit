package Composite;

interface PCBuilder {
    Composite PCBuilder();
}

class CheapPCBuilder implements PCBuilder{
    public Composite PCBuilder() {
        Component storage = new Leaf("Storage", 60);
        Component cpu = new Leaf("CPU", 100);
        Component gpu = new Leaf("GPU", 200);
        Component ram = new Leaf("RAM", 50);
        Component monitor = new Leaf("Monitor", 150);

        // no price because it's not real
        Composite computer = new Composite("Computer", 0);

        Composite motherboard = new Composite("Motherboard", 80);

        computer.add(monitor);
        computer.add(motherboard);

        motherboard.add(cpu);
        motherboard.add(gpu);
        motherboard.add(ram);
        motherboard.add(storage);

        return computer;
    }
}

class ExpensivePCBuilder implements PCBuilder {
    public Composite PCBuilder() {
        Component psu = new Leaf("Power Supply", 110);
        Component ssd = new Leaf("SSD", 120);
        Component hdd = new Leaf("HDD", 60);
        Component cpu = new Leaf("CPU", 200);
        Component gpu = new Leaf("GPU", 400);
        Component ram = new Leaf("RAM", 100);
        Component monitor = new Leaf("Monitor", 300);

        // no price because it's not real
        Composite computer = new Composite("Computer", 0);

        Composite motherboard = new Composite("Motherboard", 160);

        computer.add(monitor);
        computer.add(psu);
        computer.add(motherboard);

        motherboard.add(cpu);
        motherboard.add(gpu);
        motherboard.add(ram);
        motherboard.add(hdd);
        motherboard.add(ssd);

        return computer;
    }

}
