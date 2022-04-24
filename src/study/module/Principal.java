package study.module;

public class Principal extends Teacher{
    public Principal(){
        super.power=100;
    }
    public void voteRule(){
        System.out.println("교칙을 의결합니다!");
    }
}
