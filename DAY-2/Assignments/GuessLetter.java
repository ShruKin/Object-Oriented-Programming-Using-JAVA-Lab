import java.io.IOException;

public class GuessLetter {
    public static void main(String[] args) throws IOException{
        char guess, letter = 'k';

        System.out.println("I'm guess a character... Can you guess it?");
        System.out.print("Enter character: ");
        guess = (char) System.in.read();

        if (guess == letter) {
            System.out.println("Yes! You're right!");
        } else {
            System.out.print("Sorry! You are ");
            if (guess < letter) {
                System.out.println("too low");
            } else {
                System.out.println("too high");
            }
        }
    }
}