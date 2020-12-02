import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IllegalArgumentException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        String name;
        int [] marks = new int[6];
        int sum = 0;
        
        try {
            name = s.nextLine();
            for(int i=0; i<6; i++) {
                marks[i] = s.nextInt();
                if (marks[i]<0 || marks[i]>50) {
                    throw new IllegalArgumentException();
                }
                sum += marks[i];
            }
            System.out.println(sum);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}