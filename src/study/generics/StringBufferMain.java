package generics;

public class StringBufferMain {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        sb1.append("안녕")
                .append("또 만나")
                .append("사랑행");
        System.out.println(sb1.toString() + ' ' + sb1.hashCode());

        sb1.replace(0, 2, "역겹다");
        System.out.println(sb1.toString()+ ' ' + sb1.hashCode());

        sb1.reverse();
        System.out.println(sb1.toString());

        sb1.delete(6, 15);
        System.out.println(sb1.toString());

        replaces(sb1);
        System.out.println(sb1.toString());
    }
    public static void replaces(StringBuffer sb){
        sb.reverse();
        sb.replace(0, 3, "고고");
    }
}
