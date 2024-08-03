import java.util.ArrayList;

public class Faculty {
    
    private String name;
    private String department;

    // Static list to hold all faculty members
    public static ArrayList<Faculty> facultiesList = new ArrayList<>();

    public Faculty(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }


    public static ArrayList<Faculty> getFacultyList() {
        return facultiesList;
    }

    // Method to add a student to the list
    public static void addStudent(Faculty faculty, ArrayList<Faculty> facultyList) {
      
        facultyList.add(faculty);
    }
    // Override the toString method
    @Override
    public String toString() {
        return "Faculty[name='" + name + "', department='" + department + "'\n";
    }
}

