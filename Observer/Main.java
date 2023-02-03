package Observer;

public class Main {
    public static void main(String[] args) {
        ClockTimer clockTimer = new ClockTimer();
        DigitalClock digitalClock = new DigitalClock(clockTimer);
        DigitalClock digitalClock2 = new DigitalClock(clockTimer);


        // create a new thread that calls tick() every second
        Thread thread = new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                clockTimer.tick();
            }
        });
        thread.start();
    }
}
