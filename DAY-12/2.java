import java.io.*;
import java.util.*;

class Counter {
    public void print() {
        for(int i=0; i<100; i++){
            System.out.println(i);
        }
    }
}

class CounterThread extends Thread {
    Counter C;
    CounterThread(Counter C) {
        this.C = C;
    }
    
    public void run() {
        synchronized(C) {
            C.print();
        }
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Counter C = new Counter();
        
        CounterThread T1 = new CounterThread(C);
        CounterThread T2 = new CounterThread(C);
        
        T1.start();
        T2.start();
    }
}