package service;

import model.Student;

import java.util.List;

public interface StudentManagement {

    List<Student> getList();

    void showAll();

    void saveStudent(Student student);

    void removeStudent(int StudentId);

    Student findById(int StudentId);

    double getAverageScore();

    List<Student> sortByScore();
}
