import java.util.Scanner;

class Employee2 {

    private int empNo;
    private String empName;
    private int basic;
    private double HRA;
    private double DA;
    private double grossSalary;

    public Employee2(int empNo, String empName, int basic) {
        this.empNo = empNo;
        this.empName = empName;
        this.basic = basic;
        DA = 0.9 * basic;
        HRA = 0.15 * basic;
        grossSalary = basic + HRA + DA;
    }

    public double getSalary() {
        return grossSalary;
    }

    public void displayDetails() {
        System.out.println("Employee No.: " + empNo);
        System.out.println("Employee Name: " + empName);
        System.out.println("Basic: " + basic);
        System.out.println("DA: " + DA);
        System.out.println("HRA: " + HRA);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class Employee2Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        double maxSalary = 0.0;

        Employee2 emp[] = new Employee2[n];

        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter employee number, name, salary for Employee " + (i + 1));
            int empNo = sc.nextInt();
            sc.nextLine();
            String empName = sc.nextLine();
            int basic = sc.nextInt();

            emp[i] = new Employee2(empNo, empName, basic);
        }

        Employee2 maxSalaryEmployee = null;
        for (Employee2 employee2 : emp) {
            if (employee2.getSalary() > maxSalary) {
                maxSalary = employee2.getSalary();
                maxSalaryEmployee = employee2;
            }
        }

        System.out.println("\nMax Salary Employee details: ");
        maxSalaryEmployee.displayDetails();
        sc.close();
    }
}