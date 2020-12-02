import java.io.*;
import java.util.*;

class CounterThread extends Thread {
    public void run() {
        long start = System.currentTimeMillis(), counter = 0;
        while (System.currentTimeMillis() - start <= 10) {
            counter++;
        }
        System.out.println("Thread with Priority " + getPriority() + ": " + counter);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        CounterThread T1 = new CounterThread();
        CounterThread T2 = new CounterThread();
        CounterThread T3 = new CounterThread();
        CounterThread T4 = new CounterThread();
        
        T1.setPriority(1);
        T2.setPriority(3);
        T3.setPriority(5);
        T4.setPriority(7);
        
        T1.start();
        T2.start();
        T3.start();
        T4.start();
    }
}