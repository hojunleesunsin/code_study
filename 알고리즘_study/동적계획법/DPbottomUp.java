// 동적 계획법 피보나치 bottom-up(바텀-업) 구현 방식

package 알고리즘_study.동적계획법;

import java.util.Scanner;

public class DPbottomUp {
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
        for(int i = 2; i <= n; i++) {
            D[i] = D[i-1] + D[i-2];
        }

        System.out.println(D[n]);
    }
}