package Facade;

public class CPU {
    protected Memory memory;
    private int position = 0;

    public CPU() {
        this.memory = new Memory();
    }
    public void freeze() {
        System.out.println("CPU on 🧊");
    }

    public void jump(int position) {
        System.out.println("cpu jump to " + position);
        this.position = position;
    }

    public void execute() {
        System.out.print("cpu executing 🤖 ");
        memory.load(position, 1);
        position++;
    }
}
