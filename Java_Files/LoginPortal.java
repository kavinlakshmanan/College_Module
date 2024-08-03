import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginPortal {

    private static final Map<String, String> userDatabase = new HashMap<>(); // Mock user database
    private static final Map<String, Department> departmentDatabase = new HashMap<>(); // Mock department database
    private static String departmentname;
    public static ArrayList<Student> studentList = new ArrayList<>();
    public static ArrayList<Faculty> facultiesList = new ArrayList<>();

    public static void main(String[] args) {

        // Adding Mock Staff names
        userDatabase.put("DR.MIKE", "1001");
        userDatabase.put("1", "1");
        userDatabase.put("DR.SARAH", "1002");
        userDatabase.put("DR.EMMA", "1004");
        userDatabase.put("DR.WILLIAM", "1005");
        userDatabase.put("DR.OLIVIA", "1006");
        userDatabase.put("DR.BENJAMIN", "1007");
        userDatabase.put("DR.SOPHIA", "1008");
        userDatabase.put("DR.LUCAS", "1009");
        userDatabase.put("DR.MIA", "1010");

        userDatabase.put("DR.HENRY", "1011");
        userDatabase.put("DR.AVA", "1012");
        userDatabase.put("DR.ALEXANDER", "1013");
        userDatabase.put("DR.ISABELLA", "1014");
        userDatabase.put("DR.SEBASTIAN", "1015");
        userDatabase.put("DR.AMELIA", "1016");
        userDatabase.put("DR.JACKSON", "1017");
        userDatabase.put("DR.CHARLOTTE", "1018");
        userDatabase.put("DR.DANIEL", "1019");
        userDatabase.put("DR.EVELYN", "1020");

        userDatabase.put("DR.MATTHEW", "1021");
        userDatabase.put("DR.HARPER", "1022");
        userDatabase.put("DR.DAVID", "1023");
        userDatabase.put("DR.LILY", "1024");
        userDatabase.put("DR.JOSEPH", "1025");
        userDatabase.put("DR.ARIA", "1026");
        userDatabase.put("DR.SAMUEL", "1027");
        userDatabase.put("DR.SCARLETT", "1028");
        userDatabase.put("DR.JOHN", "1029");
        userDatabase.put("DR.ELLA", "1030");

        // Department Details
        departmentDatabase.put("CSE", new Department("CSE"));
        departmentDatabase.put("1", new Department("CSE"));

        departmentDatabase.put("MECH", new Department("MECH"));
        departmentDatabase.put("CIVIL", new Department("CIVIL"));
        departmentDatabase.put("EEE", new Department("EEE"));
        departmentDatabase.put("CCE", new Department("CCE"));
        departmentDatabase.put("CSBS", new Department("CSBS"));
        departmentDatabase.put("AIDS", new Department("AIDS"));
        departmentDatabase.put("AIML", new Department("AIML"));
        departmentDatabase.put("ECE", new Department("ECE"));

        // Students Details
        studentList.add(new Student("John Doe", 1001, "CSE"));
        studentList.add(new Student("Jane Smith", 1002, "ECE"));
        studentList.add(new Student("Alice Johnson", 1003, "MECH"));
        studentList.add(new Student("Bob Brown", 1004, "CIVIL"));
        studentList.add(new Student("Charlie Davis", 1005, "EEE"));
        studentList.add(new Student("Diana Evans", 1006, "CCE"));
        studentList.add(new Student("Ethan Wilson", 1007, "CSBS"));
        studentList.add(new Student("Fiona Green", 1008, "AIDS"));
        studentList.add(new Student("George Harris", 1009, "AIML"));
        studentList.add(new Student("Hannah King", 1010, "CSE"));
        studentList.add(new Student("Ian Lee", 1011, "ECE"));
        studentList.add(new Student("Judy Martin", 1012, "MECH"));
        studentList.add(new Student("Kevin Nelson", 1013, "CIVIL"));
        studentList.add(new Student("Laura Ortiz", 1014, "EEE"));
        studentList.add(new Student("Michael Parker", 1015, "CCE"));
        studentList.add(new Student("Nina Quinn", 1016, "CSBS"));
        studentList.add(new Student("Oscar Roberts", 1017, "AIDS"));
        studentList.add(new Student("Paula Scott", 1018, "AIML"));
        studentList.add(new Student("Quincy Taylor", 1019, "CSE"));
        studentList.add(new Student("Rachel Underwood", 1020, "ECE"));
        studentList.add(new Student("Steve Vance", 1021, "MECH"));

        // faculties datails
        facultiesList.add(new Faculty("Dr. Mike", "CSE"));
        facultiesList.add(new Faculty("Dr. James", "MECH"));
        facultiesList.add(new Faculty("Dr. Emma", "CIVIL"));
        facultiesList.add(new Faculty("Dr. William", "EEE"));
        facultiesList.add(new Faculty("Dr. Olivia", "CCE"));
        facultiesList.add(new Faculty("Dr. Benjamin", "CSBS"));
        facultiesList.add(new Faculty("Dr. Sophia", "AIDS"));
        facultiesList.add(new Faculty("Dr. Lucas", "AIML"));
        facultiesList.add(new Faculty("Dr. Mia", "CSE"));
        facultiesList.add(new Faculty("Dr. Henry", "ECE"));
        facultiesList.add(new Faculty("Dr. Ava", "MECH"));
        facultiesList.add(new Faculty("Dr. Alexander", "CIVIL"));
        facultiesList.add(new Faculty("Dr. Isabella", "EEE"));
        facultiesList.add(new Faculty("Dr. Sebastian", "CCE"));
        facultiesList.add(new Faculty("Dr. Amelia", "CSBS"));
        facultiesList.add(new Faculty("Dr. Jackson", "AIDS"));
        facultiesList.add(new Faculty("Dr. Charlotte", "AIML"));
        facultiesList.add(new Faculty("Dr. Daniel", "CSE"));
        facultiesList.add(new Faculty("Dr. Evelyn", "ECE"));
        facultiesList.add(new Faculty("Dr. Sarah", "ECE"));

        Scanner scanner = new Scanner(System.in);
        boolean isLoggedIn = false;

        String usertype = "";

        do {
            printBoxedMessage("Department Login System", "Enter your credentials or type 'exit' to quit");

            System.out.print("Username: ");
            String username = scanner.nextLine().trim();

            // Check if the user wants to exit
            if ("exit".equalsIgnoreCase(username)) {
                break;
            }

            System.out.print("Password: ");
            String password = scanner.nextLine().trim();

            System.out.print("Department: ");
            departmentname = scanner.nextLine().trim();

            System.out.print("UserId: ");
            String userid = scanner.nextLine().trim();

            // Validate inputs
            if (username.isEmpty() || password.isEmpty() || departmentname.isEmpty() || userid.isEmpty()) {
                printBoxedMessage("Error", "All fields are required. Please try again.");
                continue;
            }

            // Mock authentication
            if (authenticate(username, password, departmentname)) {
                printBoxedMessage("Success", "Login successful!");
                isLoggedIn = true;
                switch (userid) {
                    case "1":
                        usertype = "1";

                        break;
                    case "2":
                        usertype = "2";

                        break;

                    case "3":
                        usertype = "3";

                        break;

                    default:
                        break;
                }

            } else {
                printBoxedMessage("Error", "Invalid username, password, or department. Please try again.");
            }

        } while (!isLoggedIn);

        if (!isLoggedIn) {
            System.out.println("Exiting the system. Goodbye!");
        } else {
            openDepartmentPage(departmentname, scanner, usertype);

        }

    }

    private static boolean authenticate(String username, String password, String departmentName) {
        return userDatabase.containsKey(username)
                && userDatabase.get(username).equals(password)
                && departmentDatabase.containsKey(departmentName);
    }

    private static void printBoxedMessage(String title, String message) {
        int width = Math.max(title.length(), message.length()) + 44;
        String horizontalBorder = "+" + "-".repeat(width) + "+";

        System.out.println(horizontalBorder);
        System.out.println("| " + centerAlign(title, width - 2) + " |");
        System.out.println(horizontalBorder);
        System.out.println("| " + centerAlign(message, width - 2) + " |");
        System.out.println(horizontalBorder);
    }

    private static void openDepartmentPage(String departmentName, Scanner scanner, String usertype) {

        switch (usertype) {
            // HOD
            case "1":

                printBoxedMessage(departmentName + " Department", "Accessing the department page [HOD] ...");
                printBoxedMessage("Department Page", "Choose an option(1-4) :");
                System.out.println("|              1.View Students                                      |");
                System.out.println("|              2.View Faculty                                       |");
                System.out.println("|              3.View Modules                                       |");
                System.out.println("|              4.Logout                                             |");
                System.out.println("+" + "_".repeat(66) + "+");
                break;

            // FACULTY
            case "2":
                printBoxedMessage(departmentName + " Department", "Accessing the department page [FACULTY] ...");
                printBoxedMessage("Department Page", "Choose an option(1-4) :");
                System.out.println("|              1.View Students                                      |");
                System.out.println("|              2.View Faculty                                       |");
                System.out.println("|              3.View Modules                                       |");
                System.out.println("|              4.Logout                                             |");
                System.out.println("+" + "_".repeat(66) + "+");
                break;

            // // Student
            // case "3":
            // printBoxedMessage(departmentName + " Department", "Accessing the department
            // page [STUDENT] ...");
            // printBoxedMessage("Department Page", "Choose an option(1-4) :");
            // System.out.println("| 1.View Subjects |");
            // System.out.println("| 2.View Assignments |");
            // System.out.println("| 3.View TimeTable |");
            // System.out.println("| 4.Logout |");
            // System.out.println("+" + "_".repeat(66) + "+");
            // break;

            default:
                printBoxedMessage(departmentName + " Department", "Accessing the department page...");
                printBoxedMessage("Department Page", "Choose an option(1-4) :");
                System.out.println("|              1.View Students                                      |");
                System.out.println("|              2.View Faculty                                       |");
                System.out.println("|              3.View Modules                                       |");
                System.out.println("|              4.Logout                                             |");
                System.out.println("+" + "_".repeat(66) + "+");
                break;

        }

        boolean exitDepartmentPage = false;

        while (!exitDepartmentPage) {
            System.out.print("Your option : ");
            String choice = scanner.nextLine().trim();

            A: switch (choice) {

                case "1": {
                    printBoxedMessageDept("                     View Students                       ",
                            "Viewing Students...");
                    printBoxedMessage("Student Page", "Choose an option(1-4) :");
                    System.out.println("|              1.Get Student Details                                |");
                    System.out.println("|              2.Get Attendence List                                |");
                    System.out.println("|              3.Exit Student page                                  |");
                    System.out.println("|              4.Logout                                             |");
                    System.out.println("+" + "_".repeat(67) + "+");
                    System.out.print("Your option : ");

                    String choice1 = scanner.nextLine().trim();
                    switch (choice1) {

                        case "1":

                            printBoxedMessageDept("                      Students List                       ",
                                    "Viewing Students List...");
                            for (Student i : studentList) {

                                System.out.println(i);
                            }

                            break;

                        case "2":
                            printBoxedMessageDept("                     Attendence                       ",
                                    "96 % Attendence ...     ");
                            break;

                        case "3":
                            printBoxedMessage(departmentName + " Department", "Accessing the department page...");
                            System.out.println(
                                    "|              1.View Students                                              |");
                            System.out.println(
                                    "|              2.View Faculty                                               |");
                            System.out.println(
                                    "|              3.View Modules                                               |");
                            System.out.println(
                                    "|              4.Logout                                                     |");
                            System.out.println("+" + "_".repeat(66) + "+");
                            printBoxedMessage("Department Page", "Choose an option(1-4) :");

                            break A;

                        case "4":
                            System.out.println("Exiting the system. Goodbye!");
                            return;

                    }

                    break;

                }

                case "2": {
                    printBoxedMessageDept("                     View Faculty                       ",
                            "Viewing Faculty...");
                    printBoxedMessage("Student Page", "Choose an option(1-4) :");
                    System.out.println("|              1.Get Faculty Details                                |");
                    System.out.println("|              2.Get Attendence List                                |");
                    System.out.println("|              3.Exit Faculty page                                  |");
                    System.out.println("|              4.Logout                                             |");
                    System.out.println("+" + "_".repeat(67) + "+");
                    System.out.print("Your option : ");

                    String choice1 = scanner.nextLine().trim();
                    switch (choice1) {

                        case "1":

                            printBoxedMessageDept("                      Faculty List                       ",
                                    "Viewing Faculty List...");
                            for (Faculty i : facultiesList) {

                                System.out.println(i);
                            }

                            break;

                        case "2":
                            printBoxedMessageDept("                     Attendence                       ",
                                    "96 % Attendence ...     ");
                            break;

                        case "3":
                            printBoxedMessage(departmentName + " Department", "Accessing the department page...");
                            System.out.println(
                                    "|              1.View Students                                              |");
                            System.out.println(
                                    "|              2.View Faculty                                               |");
                            System.out.println(
                                    "|              3.View Modules                                               |");
                            System.out.println(
                                    "|              4.Logout                                                     |");
                            System.out.println("+" + "_".repeat(66) + "+");
                            printBoxedMessage("Department Page", "Choose an option(1-4) :");

                            break A;

                        case "4":
                            System.out.println("Exiting the system. Goodbye!");
                            return;

                    }

                    break;

                }
                case "3": {
                    printBoxedMessageDept("                     View Module                       ",
                            "Viewing Module...");
                    printBoxedMessage("Student Page", "Choose an option(1-7) :");
                    System.out.println("|              1.Assignment Module                                  |");
                    System.out.println("|              2.Examination Module                                 |");
                    System.out.println("|              3.Documents Module                                   |");
                    System.out.println("|              4.Communication Module                               |");
                    System.out.println("|              5.Survey Module                                      |");
                    System.out.println("|              6.Exit Module Page                                   |");
                    System.out.println("|              7.Logout                                             |");
                    System.out.println("+" + "_".repeat(67) + "+");
                    System.out.print("Your option : ");

                    String choice1 = scanner.nextLine().trim();
                    switch (choice1) {

                        case "1":

                            printBoxedMessageDept("                      Assignment Module                       ",
                                    "Viewing Assignment Module...");
                            

                            break;

                        case "2":
                            printBoxedMessageDept("                     Examination Module                      ",
                                    "Viewing Examination Module...     ");
                            break;

                        case "3":
                        printBoxedMessageDept("                      Documents Module                       ",
                                    "Viewing Documents Module...");
                            printBoxedMessage(departmentName + " Department", "Accessing the department page...");
                            System.out.println(
                                    "|              1.View Students                                              |");
                            System.out.println(
                                    "|              2.View Faculty                                               |");
                            System.out.println(
                                    "|              3.View Modules                                               |");
                            System.out.println(
                                    "|              4.Logout                                                     |");
                            System.out.println("+" + "_".repeat(66) + "+");
                            printBoxedMessage("Department Page", "Choose an option(1-4) :");

                            break A;


                        case "4":
                        printBoxedMessageDept("                      Communication Module                       ",
                        "Viewing Communication Module...");
                        break;
                        case "5":
                        printBoxedMessageDept("                      Survey Module                       ",
                        "Viewing Survey Module...");
                        break;
                        case "6":
                        printBoxedMessage(departmentName + " Department", "Accessing the department page...");
                            System.out.println(
                                    "|              1.View Students                                              |");
                            System.out.println(
                                    "|              2.View Faculty                                               |");
                            System.out.println(
                                    "|              3.View Modules                                               |");
                            System.out.println(
                                    "|              4.Logout                                                     |");
                            System.out.println("+" + "_".repeat(66) + "+");
                            printBoxedMessage("Department Page", "Choose an option(1-4) :");

                            break A;
                        
             

                        case "7":
                       
                            System.out.println("Exiting the system. Goodbye!");
                            return;

                    }

                    break;
                }

                case "4":
                    printBoxedMessageDept("Logout", "Logging out from " + departmentName + " department...");
                    exitDepartmentPage = true;
                    break;
                default:
                    printBoxedMessageDept("Error", "Invalid option. Please choose again.");
                    break;

            }
        }
    }

    private static void printBoxedMessageDept(String title, String message) {
        int width = Math.max(title.length(), message.lines().mapToInt(String::length).max().orElse(title.length())) + 4;
        String horizontalBorder = "+" + "-".repeat(width) + "+";

        System.out.println(horizontalBorder);
        System.out.println("| " + centerAlign(title, width - 2) + " |");
        System.out.println(horizontalBorder);

        for (String line : message.split("\n")) {
            System.out.println("| " + centerAlign(line, width - 2) + " |");
        }

        System.out.println(horizontalBorder);
    }

    private static String centerAlign(String text, int width) {
        int padding = (width - text.length()) / 2;
        return " ".repeat(padding) + text + " ".repeat(width - padding - text.length());
    }
}
