import java.io.*;
import java.util.*;

class HelloThread extends Thread {
    public void sayHello() {
        System.out.println("Hello!");
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        HelloThread T1 = new HelloThread();
        
        T1.start();
        T1.sayHello();
    }
}