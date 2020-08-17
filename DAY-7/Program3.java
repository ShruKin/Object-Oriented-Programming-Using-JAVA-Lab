import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String s = sc.nextLine();

        int upperCase = 0, lowerCase = 0, digits = 0, spaces = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                upperCase++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                lowerCase++;
            } else if (Character.isDigit(s.charAt(i))) {
                digits++;
            } else if (Character.isWhitespace(s.charAt(i))) {
                spaces++;
            }
        }

        System.out.println("No of Uppercase characters are: " + upperCase);
        System.out.println("No of LowerCase characters are: " + lowerCase);
        System.out.println("No of Digits characters are: " + digits);
        System.out.println("No of White Spaces characters are: " + spaces);

        sc.close();
    }
}