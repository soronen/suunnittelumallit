package Facade;

import java.util.Arrays;

public class Storage {
    private final char[] data = new char[256];

    public void write(int location, char[] data) {
        System.out.println("Storage: Write " + Arrays.toString(data) + " to " + location);
        System.arraycopy(data, 0, this.data, location, data.length);
    }

    public char[] read(int location, int size) {
        System.out.println("Storage: Read " + data[location] + " bytes from " + location);
        char[] stored = new char[size];
        System.arraycopy(data, location, stored, 0, size);
        return stored;
    }

}
