
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Institute i = new Institute();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1:Add Student Details");
            System.out.println("2:Add Course Details");
            System.out.println("3:Display Student Details");
            System.out.println("4:Exit");
            System.out.println("5:Add payment details");
            int choice = sc.nextInt();
            sc.nextLine();

            String regNo;
            String courseCode;
            String paymentID;

            switch (choice) {
                case 1:
                    System.out.println("Enter student name");
                    String name = sc.nextLine();
                    System.out.println("Enter student id");
                    regNo = sc.nextLine();
                    System.out.println("Enter the password");
                    String password = sc.nextLine();
                    i.addStudent(name, regNo, password);
                    break;

                case 2:
                    System.out.println("Enter course name");
                    String courseName = sc.nextLine();
                    System.out.println("Enter course id");
                    courseCode = sc.nextLine();
                    i.addCourse(courseName, courseCode);
                    break;
                case 3:
                    i.getStudents();
                    break;
                case 4:
                    System.exit(0);
                    break;
                case 5:
                    System.out.println("Enter student id");
                    regNo = sc.nextLine();
                    System.out.println("Enter payment Id");
                    paymentID = sc.nextLine();
                    System.out.println("Enter course id");
                    courseCode = sc.nextLine();
                    System.out.println("Enter the amout ");
                    double amount = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Enter month");
                    String month = sc.nextLine();
                    Payment p = new Payment(paymentID, month, amount, courseCode);
                    // i.searchStudent(regNo).addPayment(paymentID, month, amount, courseCode);
                    i.students.get(i.searchStudent(regNo)).addPayment(paymentID, month, amount, courseCode);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}