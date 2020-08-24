class Staff {
    protected int code;
    protected String name;

    public Staff(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public void showData() {
        System.out.println("This is a Staff");
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

class Teacher extends Staff {
    private String subject, publication;

    public Teacher(int code, String name, String subject, String publication) {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }

    public void showData() {
        super.showData();
        System.out.println("This is a Teacher");
        System.out.println("Subject: " + subject);
        System.out.println("Publication: " + publication);
    }
}

class Officer extends Staff {
    private String grade;

    public Officer(int code, String name, String grade) {
        super(code, name);
        this.grade = grade;
    }

    public void showData() {
        super.showData();
        System.out.println("This is an Officer");
        System.out.println("Grade: " + grade);
    }
}

class Typist extends Staff {
    protected int speed;

    public Typist(int code, String name, int speed) {
        super(code, name);
        this.speed = speed;
    }

    public void showData() {
        super.showData();
        System.out.println("This is a Typist");
        System.out.println("Speed: " + speed);
    }
}

class RegularTypist extends Typist {
    private float remuneration;

    public RegularTypist(int code, String name, int speed, float remuneration) {
        super(code, name, speed);
        this.remuneration = remuneration;
    }

    public void showData() {
        super.showData();
        System.out.println("This is a Regular Typist");
        System.out.println("Remuneration: " + remuneration);
    }
}

class CasualTypist extends Typist {
    private float dailyWages;

    public CasualTypist(int code, String name, int speed, float dailyWages) {
        super(code, name, speed);
        this.dailyWages = dailyWages;
    }

    public void showData() {
        super.showData();
        System.out.println("This is a Casual Typist");
        System.out.println("Daily Wages: " + dailyWages);
    }
}

public class InstituteDatabase {
    public static void main(String[] args) {
        Teacher t = new Teacher(1, "Moumita Ma'am", "Object Oriented Programming with Java", "Oxford");
        Officer o = new Officer(2, "Rajesh Singh", "B");
        RegularTypist rt = new RegularTypist(3, "Rohit Basu", 170, 12000f);
        CasualTypist ct = new CasualTypist(3, "Rahul Roy", 190, 600f);

        t.showData();
        System.out.println("--------------------------------");
        o.showData();
        System.out.println("--------------------------------");
        rt.showData();
        System.out.println("--------------------------------");
        ct.showData();
    }
}