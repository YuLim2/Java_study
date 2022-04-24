package pre;

import java.util.ArrayList;
import java.util.Arrays;

public class str07 {
    public static void main(String[] args) {
        ArrayList<String> myList =new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String str = String.join(" ", myList);
        System.out.println(str); // [Life, is, too, short] 출력
    }
}
