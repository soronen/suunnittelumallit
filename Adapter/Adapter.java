package Adapter;

import java.util.Arrays;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public String getData() {
        String data = Arrays.toString(adaptee.getData());
        data = data.substring(1, data.length() - 1);
        data = data.replaceAll(", ", "");
        return data;
    }

    public void setData(String data) {
        adaptee.setData(data.toCharArray());
    }


}
