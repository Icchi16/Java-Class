package service;

import model.Student;

import java.util.*;

public class StudentManagementIMPL implements StudentManagement {

    static List<Student> studentList = new ArrayList<Student>();

    static {
        studentList.add(new Student(1, "Hung", 2.4));
        studentList.add(new Student(2, "Trang", 5.2));
        studentList.add(new Student(3, "Jakc", 8.3));
        studentList.add(new Student(4, "Miles", 7.4));
    }

    @Override
    public List<Student> getList() {
        return studentList;
    }

    @Override
    public void showAll() {
        for (Student student : studentList
        ) {
            System.out.println(student.toString());
        }

    }

    @Override
    public void saveStudent(Student student) {
        studentList.add(new Student(student.getStudentId(), student.getName(), student.getAverageScore()));
        System.out.println("Add Student Completed");
    }

    @Override
    public void removeStudent(int studentId) {
        studentList.remove(findById(studentId));
    }

    @Override
    public Student findById(int studentId) {
        for (Student student : studentList
        ) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        System.out.println("No Student Found");
        System.err.print("No Student Found");
        return null;
    }

    @Override
    public double getAverageScore() {
        double sum = 0;
        double result = 0;
        for (Student student : studentList
        ) {
            sum += student.getAverageScore();
        }
        result = Math.round(sum * 100.0 / studentList.size()) / 100.0;
        return result;
    }

    @Override
    public List<Student> sortByScore() {
        studentList.sort(Comparator.comparing(Student::getAverageScore));
        return studentList;
    }
}
