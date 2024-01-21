class Solution {
    public int solution(int chicken) {
        int answer = 0;

        while (chicken >= 10) {
            int newChicken = chicken / 10;
            int restChicken = chicken % 10;
            chicken = newChicken + restChicken;

            answer += newChicken;
        }
        return answer;
    }
}

new = 108
rest = 1
chicken = 109
answer = 108

new = 10
rest = 9
chicken = 19
answer = 118

new = 1
rest = 9
chicken = 10  
answer = 119

new = 1
rest = 0
chicken = 1
answer = 120