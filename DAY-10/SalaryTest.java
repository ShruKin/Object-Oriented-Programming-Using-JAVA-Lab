interface Gross {
    double TA = 950.0;
    double DA = 2200.0;

    void print();
}

abstract class Employee {
    protected String name;
    protected float basicSalary;

    Employee(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }

    abstract public void print();
}

class Salary extends Employee implements Gross {
    private float HRA;

    Salary(String name, float basicSalary, float HRA) {
        super(name, basicSalary);
        this.HRA = HRA;
    }

    public void print() {
        System.out.println("Name of Employee : " + name);
        System.out.println("TA of Employee : " + TA);
        System.out.println("DA of Employee : " + DA);
        System.out.println("Basic Salary of Employee : " + basicSalary);
    }

    public double calcGrossSalary() {
        return basicSalary + TA + DA + HRA;
    }
}

public class SalaryTest {
    public static void main(String[] args) {
        Salary s = new Salary("Mohan", 10000, 3000);
        s.print();
        System.out.println("Gross Salary of Employee : " + s.calcGrossSalary());
    }
}
