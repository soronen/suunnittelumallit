package Observer;

public class ClockTimer extends Subject {
    private int hour;
    private int minute;
    private int second;

    public ClockTimer() {
        hour = 0;
        minute = 0;
        second = 0;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void tick() {
        second++;
        if (second == 60) {
            second = 0;
            minute++;
            if (minute == 60) {
                minute = 0;
                hour++;
                if (hour == 24) {
                    hour = 0;
                }
            }
        }
        notifyObservers();
    }

    public void setClock(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
}
