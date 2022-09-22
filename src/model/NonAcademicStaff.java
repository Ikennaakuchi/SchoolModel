package model;

public class NonAcademicStaff extends Person implements Staffs{
    public void checkMail(){
        System.out.println("Please check recent mail");
    }

    @Override
    public void takeALeave() {
        System.out.println("Apply for Leave");
    }

    @Override
    public void resign() {
        System.out.println("Resign");
    }
}
