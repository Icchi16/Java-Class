package service;

import model.Student;

import java.util.Comparator;

public class CompareIMPL implements Comparator<Student> {
    @Override
    public int compare (Student stu1, Student stu2) {
        if (stu1.getAge() > stu2.getAge()) {
            return 1;
        } else if (stu1.getAge().equals(stu2.getAge())) {
            return 0;
        } else {
            return -1;
        }
    }
}
