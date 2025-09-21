import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("-----------------------------------");
        System.out.println("Enter Student Details for Kabale University");
        System.out.println("-----------------------------------");


        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();
        
        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dob = scanner.nextLine();

        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();

        System.out.print("Enter Program of Study: ");
        String programOfStudy = scanner.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = scanner.nextDouble();

        scanner.close();

        System.out.println("\nCreating a new student object...");

        Student newStudent = new Student(
            firstName, 
            lastName, 
            dob, 
            studentId, 
            programOfStudy, 
            gpa
        );

        newStudent.displayStudentDetails();

        System.out.println("Accessing an inherited method: " + newStudent.getFirstName());
    }
}