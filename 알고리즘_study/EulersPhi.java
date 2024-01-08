/*
- 오일러 피(Euler's Phi)
오일러 피 함수 P[N]의 정의는 1부터 N까지의 범위에서 N과 서로소인 자연수의
개수를 뜻한다.
서로소 : 공약수가 1 이외에 없는 것이다.
원리는 에라토스테네스의 체와 비슷하다.

- 오일러 피 함수의 원리
1. 구하고자 하는 오일러 피의 범위만큼 배열을 자기 자신의 인덱스 값으로 초기화한다.
2. 2부터 시작해 현재 배열의 값과 인덱스가 같으면(= 소수일 때) 현재 선택된 숫자(K)의 배수에
 해당하는 수를 배열에 끝까지 탐색하며 P[i] = P[i] - P[i]/K 연산을 수핸한다.(i는 K의 배수).
3. 배열의 끝까지 2번을 반복하여 오일러 피 함수를 완성한다.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EulersPhi {
    static long N;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Long.parseLong(br.readLine());
        long res = N;
        for(long k = 2; k <= Math.sqrt(N) ;k++){
            if(N % k == 0){
                res = res - res / k;
                while(N % k == 0) N /= k;
            }
        }

        if(N>1) res = res - res/N;
        System.out.println(res);
    }
}
