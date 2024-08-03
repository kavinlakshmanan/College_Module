import java.util.List;

public interface DepartmentInterface {
    
    // Get the list of faculty members in the department
    List<Faculty> getFaculty();

    // Set the list of faculty members in the department
    void setFaculty(List<Faculty> faculty);

    // Get the list of students in the department
    List<Student> getStudents();

    // Set the list of students in the department
    void setStudents(List<Student> students);
    
    // Add a faculty member to the department
    void addFaculty(Faculty faculty);

    // Remove a faculty member from the department
    void removeFaculty(Faculty faculty);

    // Add a student to the department
    void addStudent(Student student);

    // Remove a student from the department
    void removeStudent(Student student);
    
    // List all faculty members
    void listFaculty();

    // List all students
    void listStudents();
}
