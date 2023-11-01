import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
        // ArrayList<Integer> list = new ArrayList<Integer>();
        
        // for(int i=0; i<score.length; i++) {
        //     list.add(score[i]);
        // }
        // Collections.sort(list);
        
        // for(int i=0; i<score.length; i++) {
        //     if((score.length - i) % m == 0) {
        //         answer += list.get(i) * m;
        //     }
        // }

        for(int i=score.length-1; i>=0; i--) {
            if((score.length - i) % m == 0) answer += score[i] * m;
        }
        return answer;
    }
}