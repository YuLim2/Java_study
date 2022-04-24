package study.module;

public class StudentCouncil extends Student{
    public StudentCouncil(){
        super.power=50;
    }
    public void suggestRule(){
        System.out.println("교칙을 제의합니다!");
    }
}
