import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int cnt = 0;
        int zero = 0;
        int cnt1 = 0;
        
        while(!s.equals("1")) {
            cnt ++;
            cnt1 = 0;
            for(int i = 0; i<s.length(); i++) {
                if(s.charAt(i) == '0'){
                    zero ++;
                } else {
                    cnt1 ++;
                }
            }
            s = Integer.toBinaryString(cnt1);
        }
        answer[0] = cnt;
        answer[1] = zero;
        
        return answer;
    }
}

/*
s 가 1이 될때까지 이진 변환
구해야하는 값[0] = 이진 변환 횟수
구해야하는 값[1] = 제거된 0의 개수
*/