package codingtest;

import java.util.ArrayList;

public class zikze {
    public int[] solution(int[] answers) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<Integer>();
        int[] sp1 = {1, 2, 3, 4, 5};
        int[] sp2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] sp3 = {3,3,1,1,2,2,4,4,5,5};
        int a1 = 0, a2 = 0, a3 = 0;

        for(int i=0; i<answer.length; i++){
            if(answer[i%sp1.length] == sp1[i]){
                a1 ++;
            }
            if(answer[i%sp2.length] == sp2[i]){
                a2 ++;
            }
            if(answer[i%sp2.length] == sp2[i]){
                a3 ++;
            }
        }
        int max = Math.max(a1, Math.max(a2, a3));
        if(max == a1){
            list.add(1);
        }
        if(max == a2){
            list.add(2);
        }
        if(max == a3){
            list.add(2);
        }

        for(int i=0; i< list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
