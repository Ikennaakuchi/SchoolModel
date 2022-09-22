import model.*;

public class Main {
    public static void main(String[] args) {
        Principal principal = new Principal();

        Applicant applicant = new Applicant();
        applicant.setAge(20);
        applicant.checkAdmissionStatus(principal);

        Student student = new Student();
        student.submitAssignment();
        student.writeAnExam();

        Teacher teacher = new Teacher();
        teacher.teachACourse();
        teacher.markAttendance();
        teacher.prepareTestPaper();
        teacher.checkPapers();
        teacher.declareResults();
        teacher.prepareTestPaper();
        teacher.takeALeave();
        teacher.resign();

        NonAcademicStaff staff1 = new NonAcademicStaff();
        staff1.checkMail();
        staff1.resign();
        staff1.takeALeave();


    }
}
