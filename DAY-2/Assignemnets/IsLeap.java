import java.util.Scanner;

public class IsLeap {
   public static void main(String[] args) {
      int y;
      System.out.println("Enter a year: ");
      Scanner sc = new Scanner(System.in);
      y = sc.nextInt();
      if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
         System.out.println("Its a leap year");
      else
         System.out.println("Its not a leap year");
   }
}