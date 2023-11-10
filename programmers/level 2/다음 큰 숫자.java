class Solution {
    public int solution(int n) {
        int answer = 0;

        int nCnt = Integer.bitCount(n);
        
        while(true) {
            n++;
            int nextCnt = Integer.bitCount(n);
            
            if(nCnt == nextCnt) {
                break;
            }
            
        }
        answer = n;
        return answer;
    }
}

/*
Integer클래스의 bitCount를 이용해 1의 갯수를 세며 1씩 증가하며
1의 갯수가 같아질때 break
*/