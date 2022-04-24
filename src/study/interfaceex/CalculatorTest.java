package interfaceex;

public class CalculatorTest {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        CompleteCalc clac = new CompleteCalc();
        System.out.println(clac.add(num1, num2));
        System.out.println(clac.substract(num1, num2));
        System.out.println(clac.times(num1, num2));
        System.out.println(clac.divide(num1, num2));
        clac.showInfo();
    }
}
