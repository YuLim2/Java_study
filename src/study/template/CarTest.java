package template;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("자자");
        Car myCar = new AICar();
        myCar.run();

        System.out.println("사자");
        Car hisCar = new ManualCar();
        hisCar.run();
    }
}
