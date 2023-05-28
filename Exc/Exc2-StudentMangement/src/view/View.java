package view;

import config.Config;
import controller.StudentController;
import model.Student;

import java.util.List;
public class View {
    static StudentController studentController = new StudentController();

    public static void main(String[] args) {
        while (true) {
            System.out.println("------------------ Student Manager ------------------");
            System.out.println("1. Show Students List");
            System.out.println("2. Create New Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Search Student By name");
            System.out.println("6. Exit");
            System.out.println("------------------ Product Manager ------------------");
            System.out.println("Enter your choice: ");
            int choice = Integer.parseInt(Config.scanner().nextLine());
            switch (choice) {
                case 1:
                    showStudents(studentController.getListStudents());
                    break;
                case 2:
                    createStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    searchStudentByName();
                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        }
    }

    public static void showStudents(List<Student> studentList) {
        System.out.println("------------------- Students List --------------------");
        for (Student student : studentList) {
            System.out.println("1. Student Id: " + student.getStudentId());
            System.out.println("2. Student Name: " + student.getStudentName());
            System.out.println("3. Student Gender: " + (student.isMale() ? "Boy" : "Girl"));
            System.out.println("4. Student Address: " + student.getStudentAddress());
            System.out.println("5. Student Status: " + (student.isStudentStatus() ? "Student" : "Alumni"));
            System.out.println("--------------------------------------------");
        }
        System.out.println("------------------- Students List --------------------");
    }

    public static void createStudent() {
        List<Student> productList = studentController.getListStudents();
        System.out.println("Enter new students: ");
        int amount = Integer.parseInt(Config.scanner().nextLine());
        for (int i = 0; i < amount; i++) {
            System.out.println("Enter student" + (i + 1));
            int id;
            if (productList.isEmpty()) {
                id = 1;
            } else {
                id = productList.get(productList.size() - 1).getStudentId() + 1;
            }
            System.out.println("Enter student name: ");
            String name = Config.scanner().nextLine();
            System.out.println("Is student male? (true/false)");
            boolean gender = Boolean.parseBoolean(Config.scanner().nextLine());
            System.out.println("Enter student address: ");
            String address = Config.scanner().nextLine();
            boolean status = true;
            Student newStudent = new Student(id, name, gender, address, status);
            studentController.createStudent(newStudent);
            System.out.println("Create student success!");
        }
        System.out.println("Create " + amount + " student(s) success!");
    }

    public static void updateStudent() {
        while (true) {
            System.out.println("Enter id: ");
            int idU = Integer.parseInt(Config.scanner().nextLine());
            if (studentController.findById(idU) != null) {
                System.out.println("Enter new name: ");
                String nameU = Config.scanner().nextLine();
                System.out.println("Choose student new gender (true/false): ");
                boolean genderU = Boolean.parseBoolean(Config.scanner().nextLine());
                System.out.println("Enter new address: ");
                String addressU = Config.scanner().nextLine();
                System.out.println("Did student graduated? (true/false): ");
                boolean statusU = !Boolean.parseBoolean(Config.scanner().nextLine());
                Student StudentU = new Student(idU, nameU, genderU, addressU, statusU);
                studentController.updateStudent(StudentU);
                System.out.println("Update success!");
                return;
            } else System.err.println("ID not found! Try again");
        }
    }

    public static void deleteStudent() {
        while (true) {
            System.out.println("Enter id: ");
            int idR = Integer.parseInt(Config.scanner().nextLine());
            if (studentController.findById(idR) != null) {
                studentController.removeStudent(idR);
                System.out.println("Remove success!");
                return;
            } else System.err.println("ID not found! Try again");
        }
    }

    public static void searchStudentByName() {
        System.out.println("Enter Name:");
        String searchParam = Config.scanner().nextLine();
        showStudents(studentController.searchByName(searchParam));
    }
}
