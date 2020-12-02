import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        try {
            int a, b;
            a = s.nextInt();
            b = s.nextInt();
            
            int o = a/b;
            System.out.println(o);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}