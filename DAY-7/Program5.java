import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();

        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                newString += Character.toLowerCase(s.charAt(i));
            } else if (Character.isLowerCase(s.charAt(i))) {
                newString += Character.toUpperCase(s.charAt(i));
            } else {
                newString += s.charAt(i);
            }
        }

        System.out.println("New String: " + newString);
        sc.close();
    }
}