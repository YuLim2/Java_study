package study.module;

public class Teacher extends Human{
    public Teacher(){
        super.power=70;
    }
    public void teachClass(){
        System.out.println("수업을 진행합니다!");
    }
}
