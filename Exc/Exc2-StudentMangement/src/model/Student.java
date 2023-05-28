package model;
public class Student {
    private int studentId;
    private String studentName;
    private boolean studentGender;
    private String studentAddress;
    private boolean studentStatus;

    public Student(int studentId, String studentName, boolean studentGender, String studentAddress, boolean studentStatus) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentGender = studentGender;
        this.studentAddress = studentAddress;
        this.studentStatus = studentStatus;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public boolean isMale() {
        return studentGender;
    }

    public void setStudentGender(boolean studentGender) {
        this.studentGender = studentGender;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public boolean isStudentStatus() {
        return studentStatus;
    }

    public void setStudentStatus(boolean studentStatus) {
        this.studentStatus = studentStatus;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
