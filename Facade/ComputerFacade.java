package Facade;

public class ComputerFacade {
    private final CPU cpu;
    private final Memory memory;
    private final Storage storage;

    public ComputerFacade() {
        this.storage = new Storage();
        this.memory = new Memory();
        this.cpu = new CPU();
        this.cpu.memory = this.memory;
    }

    public void start() {
        cpu.freeze();
        storage.write(0, "Hello World".toCharArray());
        memory.store(0, storage.read(0, 11));

        memory.store(0, storage.read(0, 11));
        memory.load(0, 10);
        cpu.jump(0);

        for (int i = 0; i < 11; i++) {
            cpu.execute();
        }
    }
}
