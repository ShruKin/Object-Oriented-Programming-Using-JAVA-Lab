class Counter {

    private static int cnt;

    public Counter() {
        cnt++;
    }

    public int getCount() {
        return cnt;
    }
}

public class CounterTest {

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println("Count: " + c2.getCount());
    }
}