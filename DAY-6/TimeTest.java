import java.util.Scanner;

class Time {
    private int hr, min, sec;

    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public Time add(Time t2) {
        Time t3 = new Time(0, 0, 0);

        t3.sec = sec + t2.sec;

        if (t3.sec > 60) {
            t3.min++;
            t3.sec %= 60;
        }
        t3.min += (min + t2.min);

        if (t3.min > 60) {
            t3.hr++;
            t3.min %= 60;
        }
        t3.hr += (hr + t2.hr);

        return t3;
    }

    public void displayTime() {
        System.out.println("Time is: " + hr + ": " + min + ": " + sec);
    }
}

public class TimeTest {
    public static void main(String[] args) {
        int hr, min, sec;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first time:");
        hr = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();
        Time t1 = new Time(hr, min, sec);

        System.out.println("Enter second time:");
        hr = sc.nextInt();
        min = sc.nextInt();
        sec = sc.nextInt();
        Time t2 = new Time(hr, min, sec);

        Time t3 = t1.add(t2);
        t3.displayTime();

        sc.close();
    }
}