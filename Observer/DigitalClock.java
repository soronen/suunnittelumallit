package Observer;

public class DigitalClock implements Observer {
    private ClockTimer timer;
    private int hour;
    private int minute;
    private int second;

    public DigitalClock(ClockTimer timer) {
        this.timer = timer;
        timer.attach(this);
    }

    public void update(Subject s) {
        if (s == timer) {
            hour = timer.getHour();
            minute = timer.getMinute();
            second = timer.getSecond();
            System.out.println("DigitalClock: " + hour + ":" + minute + ":" + second);
        }
    }
}
