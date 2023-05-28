package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceIMPL implements IStudentService{
    static List<Student> studentList = new ArrayList<>();

    static  {
        studentList.add(new Student(1, "Đỗ Nam Trung", true, "USA", true));
        studentList.add(new Student(2, "Em Long Mút", true, "USA", true));
        studentList.add(new Student(3, "Ngoằn Thị Ngèo", false, "Trung Quốc", true));
        studentList.add(new Student(4, "Trần Văn Ku", true, "Tứ Lien", true));
        studentList.add(new Student(5, "Anh Vui", true, "Lào", true));
    }
    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void save(Student student) {
        if (findById(student.getStudentId()) != null) {
            studentList.set(studentList.indexOf(findById(student.getStudentId())),student);
        } else {
            studentList.add(student);
        }
    }

    @Override
    public Student findById(int id) {
        for (Student student:studentList) {
            if (student.getStudentId() == id) {
               return student;
            }
        }
        return null;
    }

    @Override
    public void remove(int id){
        studentList.remove(findById(id));
    }

    public List<Student> searchByName(String string) {
        List<Student> listSearch = new ArrayList<>(studentList);
        listSearch.removeIf(student -> !student.getStudentName().trim().toLowerCase().contains(string.trim().toLowerCase()));
        return listSearch;
    }

}


