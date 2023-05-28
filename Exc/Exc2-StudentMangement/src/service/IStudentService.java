package service;

import model.Student;

import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void save(Student student);
    Student findById(int id);
    void remove(int id);
    List<Student> searchByName(String string);
}
