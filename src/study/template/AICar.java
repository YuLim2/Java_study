package template;

public class AICar extends Car{
    @Override
    public void drive() {
        System.out.println("AI: 부릉부릉");
        System.out.println("AI: 끼익");
    }

    @Override
    public void stop() {
    System.out.println("AI: 끼이이이익!!!");
    }
}
