package template;

public class ManualCar extends Car{

    @Override
    public void drive() {
        System.out.println("사람: 부릉부릉");
        System.out.println("사람: 끼익");
    }

    @Override
    public void stop() {
        System.out.println("사람: 끼이이이익!!!");
    }
}
