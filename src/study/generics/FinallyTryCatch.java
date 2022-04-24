package generics;

public class FinallyTryCatch {
    public static void main(String[] args) {
        try {
            int x = 2;
            int y = 20 / (5-x);
            System.out.println(y);
        } catch (ArithmeticException e){
            System.out.println("0 아님?");
        } finally {
            System.out.println("난 꼭 될 거임");
        }
    }
}
