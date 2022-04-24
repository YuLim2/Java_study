package study.module;

public class Student extends Human{
    public Student(){
        super.power=20;
    }

    public void takeClass(){
        System.out.println("수업 듣기!");
    }
}
