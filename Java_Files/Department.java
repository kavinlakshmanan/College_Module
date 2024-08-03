import java.util.ArrayList;
import java.util.List;

public class Department implements DepartmentInterface {
   
    private String name;
    private HOD hod;
    private List<Faculty> faculty;
    private List<Student> students;

    public Department(String name) {
        this.name = name;
        this.faculty = new ArrayList<>();
        this.students = new ArrayList<>();
    }

   
    @Override
    public List<Faculty> getFaculty() {
        return faculty;
    }

    @Override
    public void setFaculty(List<Faculty> faculty) {
        this.faculty = faculty;
    }

    @Override
    public List<Student> getStudents() {
        return students;
    }

    @Override
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public void addFaculty(Faculty faculty) {
        this.faculty.add(faculty);
    }

    @Override
    public void removeFaculty(Faculty faculty) {
        this.faculty.remove(faculty);
    }

    @Override
    public void addStudent(Student student) {
        this.students.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        this.students.remove(student);
    }
    
    @Override
    public void listFaculty() {
        for (Faculty f : faculty) {
            System.out.println(f.getName());
        }
    }

    @Override
    public void listStudents() {
        for(Student i:Student.getStudentList()){
            System.out.println(i);
        }
    }

    

   

}
