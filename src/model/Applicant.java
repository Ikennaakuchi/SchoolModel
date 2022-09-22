package model;

import enums.DISCIPLINE;
import enums.GENDER;

public class Applicant extends Person{
    private String applicationID;
    private int testScore;
    private DISCIPLINE discipline;
    private int age;

    public void apply(){
        System.out.println("Please submit your application");
    }
    public void checkAdmissionStatus(Principal principal){
        System.out.println(principal.admitStudent(this));
    }

    public Applicant() {
    }

    public Applicant(String firstName, String lastName, String email, String phoneNumber, GENDER gender, String ID,
                     String applicationID, int testScore, DISCIPLINE discipline, int age) {
        super(firstName, lastName, email, phoneNumber, gender, ID);
        this.applicationID = applicationID;
        this.testScore = testScore;
        this.discipline = discipline;
        this.age = age;
    }

    public String getApplicationID() {
        return applicationID;
    }

    public void setApplicationID(String applicationID) {
        this.applicationID = applicationID;
    }

    public int getTestScore() {
        return testScore;
    }

    public void setTestScore(int testScore) {
        this.testScore = testScore;
    }

    public DISCIPLINE getDiscipline() {
        return discipline;
    }

    public void setDiscipline(DISCIPLINE discipline) {
        this.discipline = discipline;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
