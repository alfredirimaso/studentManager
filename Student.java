public class Student extends Person {
    
    private String studentId;
    private String programOfStudy;
    private double gpa;


    public Student(String firstName, String lastName, String dateOfBirth, String studentId, String programOfStudy, double gpa) {
        
        super(firstName, lastName, dateOfBirth);
        
        
        this.studentId = studentId;
        this.programOfStudy = programOfStudy;
        this.gpa = gpa;
    }

    @Override
    public String getRole() {
        return "Student";
    }

    public String getStudentId() {
        return studentId;
    }

    public String getProgramOfStudy() {
        return programOfStudy;
    }
    
    public double getGpa() {
        return gpa;
    }

    
    public void displayStudentDetails() {
        System.out.println("-----------------------------------");
        System.out.println("Kabale University Student Details");
        System.out.println("-----------------------------------");
        System.out.println("Name: " + getFirstName() + " " + getLastName());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("Role: " + getRole());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("Program of Study: " + getProgramOfStudy());
        System.out.println("GPA: " + getGpa());
        System.out.println("-----------------------------------");
    }
}