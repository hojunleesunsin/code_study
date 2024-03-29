// 동적 계획법 피보나치 top-down(톱-다운) 구현 방식
// 재귀함수

package 알고리즘_study.동적계획법;

import java.util.Scanner;

public class DPtopDown {
    static int[] D;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        D = new int[n + 1];
        for(int i = 0; i <= n; i++) {
            D[i] = -1;
        }
        D[0] = 0;
        D[1] = 1;
        fibo(n);
        System.out.println(D[n]);
    }

    static int fibo(int n) {
        if(D[n] != -1) return D[n];

        return D[n] = fibo(n-2) + fibo(n-1);
    }
}