package model;

import enums.CLASS;
import enums.GENDER;

public class Student extends Person{
    private String studentID;
    private double CGPA;
    private String discipline;
    private CLASS studentClass;

    public void submitAssignment(){
        System.out.println("Please turn in your assignment");
    }
    public void writeAnExam(){
        System.out.println("Start Exam");
    }

    public Student() {
    }


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public CLASS getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(CLASS studentClass) {
        this.studentClass = studentClass;
    }
}
