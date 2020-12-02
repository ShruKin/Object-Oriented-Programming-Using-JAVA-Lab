import java.io.*;
import java.util.*;

class TooHot extends Exception {
    public String toString(){ 
        return "TooHot" ;
   }
}

class TooCold extends Exception {
    public String toString(){ 
        return "TooCold" ;
   }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s = new Scanner(System.in);
        float tempC = s.nextFloat();
        
        try {
            if(tempC > 35) {
                throw new TooHot();
            }
            if(tempC < 5) {
                throw new TooCold();
            }
            float tempF = ((tempC*9) / 5) + 32;
            System.out.println("Normal");
            System.out.println(tempF);
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}