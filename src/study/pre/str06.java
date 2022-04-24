package pre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class str06 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        Collections.sort(myList);
        Collections.reverse((myList));
        System.out.println(myList);
    }
}
