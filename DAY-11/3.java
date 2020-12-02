import java.io.*;
import java.util.*;

public class Solution {
    
    public static long factorial(int x) {
        long fact = 1l;
        
        for(int i = 1; i <= x; i++) {
            fact *= i;
        }
        
        return fact;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            int x = sc.nextInt();
            
            if(x < 0) {
                throw new IllegalArgumentException("Value of x must be positive");
            } else if (factorial(x) > Long.MAX_VALUE) {
                throw new IllegalArgumentException("Result will overflow");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}