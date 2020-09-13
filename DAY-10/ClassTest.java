interface Exam {
    void percentCal();
}

class Student {
    protected String name;
    protected int rollNo;
    protected double marks1, marks2;

    public Student(String name, int rollNo, double marks1, double marks2) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public void show() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll no: " + rollNo);
        System.out.println("Marks: " + marks1 + ", " + marks2);
    }
}

class Result extends Student implements Exam {
    private double per;

    public Result(String name, int rollNo, double marks1, double marks2) {
        super(name, rollNo, marks1, marks2);
    }

    public void percentCal() {
        per = (marks1 + marks2) / 2;
    }

    public void display() {
        System.out.println("Percentage: " + per);
    }
}

public class ClassTest {
    public static void main(String[] args) {
        Result result = new Result("Ramesh", 15, 89, 95);
        result.show();
        result.percentCal();
        result.display();
    }
}