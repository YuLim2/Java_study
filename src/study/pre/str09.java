package pre;

import java.util.*;

public class str09 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5);
        Set<Integer> set = new HashSet<Integer>(list);
        List<Integer> newList =new ArrayList<Integer>(set);
        System.out.println(newList);
    }
}
