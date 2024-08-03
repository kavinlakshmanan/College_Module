import java.util.ArrayList;


public class Student {

    private String name;
    private int rollno;
    private String department;

    public Student(String name, int rollno, String department) {
        this.name = name;
        this.rollno = rollno;
        this.department = department;
    }

    // Static list to hold all students
    public static ArrayList<Student> studentList ;

    public static ArrayList<Student> getStudentList() {
        return studentList;
    }

    // Method to add a student to the list
    public static void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public String toString() {
        return "Student [ name='" + name + "', rollno=" + rollno + ", department='" + department + "']\n";
    }

   

    
}
