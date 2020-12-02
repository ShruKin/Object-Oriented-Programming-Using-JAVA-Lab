import java.io.*;
import java.util.*;

public class Solution extends Thread {
    
    public void run() {
        System.out.println("Running");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Thread priority: " + s.getPriority());
    }
}