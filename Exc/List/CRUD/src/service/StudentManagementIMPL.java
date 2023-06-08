package service;

import model.Student;
import java.util.List;

public class StudentManagementIMPL {
    public void showAll(List<Student> studentList) {
        for ( Student student: studentList
             ) {
            System.out.println(student.toString());
        }
    }
}
