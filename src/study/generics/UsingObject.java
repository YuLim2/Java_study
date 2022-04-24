package generics;

public class UsingObject {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        System.out.println(obj1.hashCode());
        System.out.println(Integer.toHexString(obj1.hashCode()));
        System.out.println(obj1 == obj2); //객체는 고유함
        System.out.println(obj1);
        System.out.println(obj2.toString());

        System.out.println(obj1.getClass().getName());
        String str = obj1.getClass().getName() + "@" + Integer.toHexString(obj1.hashCode());
        System.out.println(str); //클래스 이름 해쉬 코드

        Object objstr = new String("Good"); // 다형성
        System.out.println(objstr.toString());
        System.out.println(objstr instanceof Object);
        System.out.println(objstr instanceof String);

        String hello="hello";
        System.out.println(hello.getClass()); // 클래스 이름
    }
}
