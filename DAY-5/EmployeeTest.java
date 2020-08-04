import java.util.Scanner;

class Employee {
    private String name, department;
    private double salary;
    public static String company;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
        company = "My Company";
    }

    public void displayData() {
        System.out.printf("Name: %s\nDepartment: %s\nSalary: %.2f\n", name, department, salary);
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp[] = new Employee[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter name, department, salary for Employee " + (i + 1) + ": ");
            String name = sc.nextLine();
            String department = sc.nextLine();
            double salary = sc.nextDouble();
            sc.nextLine();

            emp[i] = new Employee(name, department, salary);
        }

        System.out.println("\nCompany Name: " + Employee.company);
        for (Employee employee : emp) {
            employee.displayData();
        }
    }
}
