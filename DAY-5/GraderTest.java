import java.util.Scanner;

class Grader {

    private int score;

    public Grader(int score) {
        this.score = score;
    }

    public char letterGrade() {
        char grade;
        if (score >= 90) {
            grade = 'O';
        } else if (score >= 80 && score < 90) {
            grade = 'E';
        } else if (score >= 70 && score < 60) {
            grade = 'A';
        } else if (score >= 60 && score < 50) {
            grade = 'B';
        } else if (score >= 50 && score < 40) {
            grade = 'C';
        } else {
            grade = 'F';
        }
        return grade;
    }
}

public class GraderTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter score: ");
        int score = sc.nextInt();
        if (score > 100 || score < 0) {
            System.out.println("Invalid score");
            System.exit(0);
        }
        Grader grader = new Grader(score);
        System.out.println("The grade is " + grader.letterGrade());
        sc.close();
    }
}