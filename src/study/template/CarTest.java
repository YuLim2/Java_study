package template;

public class CarTest {
    public static void main(String[] args) {
        System.out.println("ėė");
        Car myCar = new AICar();
        myCar.run();

        System.out.println("ėŽė");
        Car hisCar = new ManualCar();
        hisCar.run();
    }
}
