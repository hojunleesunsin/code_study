import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                st.push('(');
            } else {
                if(st.isEmpty()) {
                    return false;
                } else {
                st.pop();
                }
            }
        }
        answer = (st.isEmpty()) ? true : false;
        return answer;
    }
}