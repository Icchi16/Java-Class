package view;

public class StudentManagementView {
    public static void UI() {
        System.out.println("-----------Choose an option-----------");
        System.out.println("1. Show Students List");
        System.out.println("2. Add Student");
        System.out.println("3. Remove Student");
        System.out.println("-----------End of options-----------");
    }

    public static void addStudentUI() {
        System.out.println("-----------Add new Student-----------");
        System.out.println("Input following inquiry:");
    }

    public static void removeStudentUI() {
        System.out.println("-----------Remove Student-----------");
        System.out.println("Enter student ID:");
    }
}
