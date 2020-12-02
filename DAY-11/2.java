import java.io.*;
import java.util.*;
import java.lang.Math; 

class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } 
        else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero.");
        }
        return (long) Math.pow(n, p);
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        int n, p;
        for(int i=0; i<5; i++) {
            n = s.nextInt();
            p = s.nextInt();
            MyCalculator calc = new MyCalculator();
            
            try {
                System.out.println(calc.power(n, p));
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}