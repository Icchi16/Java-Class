package controller;

import model.Student;
import service.StudentManagement;
import service.StudentManagementIMPL;

import java.util.List;

public class StudentController {

    StudentManagement studentManagement = new StudentManagementIMPL();

    public List<Student> getStudentList() {
        return studentManagement.getList();
    }

    public void showAll() {
        studentManagement.showAll();
    }

    public void addStudent(Student student) {
        studentManagement.saveStudent(student);
    }

    public void removeStudent(int RStudentID) {
        studentManagement.removeStudent(RStudentID);
    }

    public double averageScore() {
        return studentManagement.getAverageScore();
    }

    public void sortByScore() {
        List<Student> sortedList = studentManagement.sortByScore();
        for (Student student: sortedList
             ) {
            System.out.println(student.toString());
        }
    }
}
