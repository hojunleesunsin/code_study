import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] supo1 = {1,2,3,4,5};
        int[] supo2 = {2,1,2,3,2,4,2,5};
        int[] supo3 = {3,3,1,1,2,2,4,4,5,5};
        int answer1=0, answer2=0, answer3=0;
        
        for(int i=0; i<answers.length; i++) {
            if(supo1[i%supo1.length] == answers[i]) answer1++;
            if(supo2[i%supo2.length] == answers[i]) answer2++;
            if(supo3[i%supo3.length] == answers[i]) answer3++;
        }
        
        int max = Math.max(answer1, Math.max(answer2, answer3));
        ArrayList<Integer> list = new ArrayList<>();
        
        if(answer1 == max) list.add(1);
        if(answer2 == max) list.add(2);
        if(answer3 == max) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}