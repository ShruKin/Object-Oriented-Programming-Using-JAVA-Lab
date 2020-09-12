import java.util.Scanner;

interface Department {
    String deptName = "CSE";
    String deptHead = "SKG";

    void print();
}

abstract class Hostel {
    protected String hostelName, hostelLocation;
    protected int noOfRooms;

    public Hostel(String hostelName, String hostelLocation, int noOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.noOfRooms = noOfRooms;
    }

    abstract public void print();
}

class Student extends Hostel implements Department {
    private String studentName;
    int regNum;
    private String electiveSub;
    private double avgMarks;

    public Student(String hostelName, String hostelLocation, int noOfRooms, String studentName, int regNum,
            String electiveSub, double avgMarks) {
        super(hostelName, hostelLocation, noOfRooms);
        this.studentName = studentName;
        this.regNum = regNum;
        this.electiveSub = electiveSub;
        this.avgMarks = avgMarks;
    }

    public void print() {
        System.out.println("Department Name: " + Department.deptName);
        System.out.println("Department Head: " + Department.deptHead);
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("No. of Rooms: " + noOfRooms);
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration No.: " + regNum);
        System.out.println("Elective Subjects: " + electiveSub);
        System.out.println("Average Marks: " + avgMarks);
    }
}

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student studs[] = new Student[100];
        int size = 0;

        while (true) {
            System.out.println("\n===============MENU===============");
            System.out.println("1. Admit a student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details of all students");

            System.out.print("Enter Option: ");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Enter Registration No.: ");
                    int regNo = sc.nextInt();
                    System.out.print("Enter Student Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Enter Elective Subjects: ");
                    String eleSubs = sc.nextLine();
                    System.out.print("Enter Average marks: ");
                    double avgMarks = sc.nextDouble();
                    System.out.print("Enter Hostel Name: ");
                    sc.nextLine();
                    String hostName = sc.nextLine();
                    System.out.print("Enter Hostel Location: ");
                    String hostLoc = sc.nextLine();
                    System.out.print("Enter No. of rooms: ");
                    int numRooms = sc.nextInt();
                    studs[size] = new Student(hostName, hostLoc, numRooms, name, regNo, eleSubs, avgMarks);
                    size++;
                    System.out.println("*****Student Admited*****");
                    break;

                case 2:
                    boolean found = false;
                    System.out.print("Enter the Registration No of the student to migrate: ");
                    int id = sc.nextInt();
                    for (int i = 0; i < size; i++) {
                        if (studs[i].regNum == id) {
                            studs[i].print();
                            for (int j = i; j < size - 1; j++) {
                                studs[j] = studs[j + 1];
                            }
                            System.out.println("*****Student Migrated*****");
                            found = !found;
                        }
                    }
                    if (!found) {
                        System.out.println("Student with Registration No. " + id + " not found!");
                    }
                    break;

                case 3:
                    System.out.println("Printing details of all the students:-");
                    for (int i = 0; i < size; i++) {
                        studs[i].print();
                        System.out.println("-----------------------------------");
                    }

                default:
                    sc.close();
                    System.exit(0);
            }
        }
    }
}