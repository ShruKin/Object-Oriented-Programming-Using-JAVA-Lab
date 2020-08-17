import java.lang.String;

public class Program1 {

    public static void main(String[] args) {
        String[] stringArr = args[0].split(" ");

        System.out.println("Words are:");
        for (String word : stringArr) {
            System.out.println(word);
        }
    }
}