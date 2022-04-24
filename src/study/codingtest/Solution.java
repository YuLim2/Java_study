package study.codingtest;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i=0; i <commands.length; i++){
            int min = commands[i][0];
            int max = commands[i][1];
            int k = commands[i][2];

            int[] a = new int[max - min + 1];

            for(int j = 0; j < a.length; j++) {
                a[j] = array[j + min - 1];
            }
            Arrays.sort(a);
            answer[i] = a[k];
        }

        return answer;
    }
}
