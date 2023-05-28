package controller;

import model.Student;
import service.IStudentService;
import service.StudentServiceIMPL;

import java.util.List;
public class StudentController {
    IStudentService studentService = new StudentServiceIMPL();
    public List<Student> getListStudents () {
        return studentService.findAll();
    }

    public void createStudent(Student student) {
        studentService.save(student);
    }

    public Student findById(int id) {
        return studentService.findById(id);
    }

    public void updateStudent(Student studentU) {
        studentService.save(studentU);
    }

    public void removeStudent(int idR) {
        studentService.remove(idR);
    }

    public List<Student> searchByName (String string) {
        return studentService.searchByName(string);
    }
}
