import java.util.*;

public class Solution {
    public int solution(int[] nums) {
        int max = nums.length / 2;
        int answer = 0;
        
        HashSet<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }
        
        if (numsSet.size() > max) {
            answer = max;
        } else {
            answer = numsSet.size();
        }
        return answer;
    }
}