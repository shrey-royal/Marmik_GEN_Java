class Time {
    protected int hours;
    protected int minutes;
    protected int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    // Method to display the time in HH:MM:SS format
    public void displayTime() {
        System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
    }
}

class Clock extends Time {

    public Clock() {
        this(0, 0, 0);
    }

    public Clock(int hours, int minutes, int seconds) {
        super(hours, minutes, seconds); //this statement must be at the top of the constructor 
        System.out.println("This is Super constructor");
    }

    // Method to advance the clock by one second
    public void tick() {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
            if (minutes == 60) {
                minutes = 0;
                hours++;
                if (hours == 24) {
                    hours = 0;
                }
            }
        }
    }

    public void reset() {
        super.hours = 0;
        super.minutes = 0;
        super.seconds = 0;
    }

    @Override
    public void displayTime() {
        super.displayTime();
    }
}

public class SuperKw {
    public static void main(String[] args) {
        Clock clock = new Clock(10, 30, 45);

        System.out.print("Current time: ");
        clock.displayTime();

        clock.tick();
        System.out.print("After tick: ");
        clock.displayTime();

        clock.reset();
        System.out.print("After reset: ");
        clock.displayTime();
    }
}
