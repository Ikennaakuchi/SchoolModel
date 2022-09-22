package model;

public class Teacher extends Person implements Staffs{
    public void teachACourse(){
        System.out.println("Please start a lesson session");
    }
    public void prepareTestPaper(){
        System.out.println("Prepare Test paper");
    }
    public void markAttendance(){
        System.out.println("Mark attendance");
    }
    public void checkPapers(){
        System.out.println("Check students' papers");
    }
    public void declareResults(){
        System.out.println("Declare students' result");
    }

    @Override
    public void takeALeave() {
        System.out.println("Application for Leave");
    }

    @Override
    public void resign() {
        System.out.println("Resignation");
    }
}
