package Adapter;

public class Adaptee {

    private char[] data;

    public Adaptee() {
        data = ("New code to write\n" +
                "Adapter pattern in sight\n" +
                "Mind blank, day or night").toCharArray();
    }

    public char[] getData() {
        return data;
    }

    public void setData(char[] data) {
        this.data = data;
    }
}
