package model;

public class Principal extends Person implements Staffs{
    public void expelStudent(){
        System.out.println("EXPEL");
    }
    public String admitStudent(Applicant applicant){
        if (applicant.getAge() > 18 && applicant.getAge() < 30){
            return  "You are admitted";
        }else{
            return "You are too young or too old";
        }
    }

    @Override
    public void takeALeave() {
        System.out.println("Please submit your leave request");
    }

    @Override
    public void resign() {
        System.out.println("Please submit your resignation letter");
    }
}
