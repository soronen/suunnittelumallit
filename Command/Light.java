package Command;


public class Light {

    boolean isOn = false;
    public void turnOn() {
        System.out.println("The light is on");
        isOn = true;
    }

    public void turnOff() {
        System.out.println("The light is off");
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}