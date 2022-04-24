package generics;

public class StringArray {
    public static void main(String[] args) {
        String[] myNum = new String[]{"123", "456", "789"};
        String[] myNum2 = {"123", "456", "678"};
        System.out.println(myNum2[0]);
        print(myNum);
        myNum = new String[]{"123", "456", "789"};
        String[] tos = new String[myNum.length];
        System.arraycopy(myNum, 0, tos, 0, myNum.length);
        print(tos);
    }
    public static void print(String[] tos){
        for(String ss:tos){
            System.out.println(ss + "\t");
        }
        System.out.println();
    }
}
