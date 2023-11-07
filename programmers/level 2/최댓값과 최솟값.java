import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < str.length; i++) {
            list.add(Integer.parseInt(str[i]));
        }
        
        answer = Collections.min(list).toString() + " " + Collections.max(list).toString();
        
        return answer;
    }
}