/*
- 그리디(greedy) 알고리즘
현재 상태에서 보는 선택지 중 최선의 선택지가 전체 선택지 중 
최선의 선택지라고 가정하는 알고리즘.
  
그리디 알고리즘 수행 과정
1. 해 선택: 현재 상태에서 가장 최선이라고 생각되는 해를 선택한다.
2. 적절성 검사: 현재 선택한 해가 전체 문제의 제약 조건에 벗어나지 않는지 검사한다.
3. 해 검사: 현재까지 선택한 해 집합이 전체 문제를 해결할 수 있는지 검사한다.
전체문제를 해결하지 못한다면 1번으로 돌아가 같은 과정을 반복한다.

단점: 늘 최적의 해를 보장하지는 않는다.

- 대표적인 그리디 알고리즘 거스름돈 문제
마트에서 계산을 하는 점원이 되었다. 
손님에게 거슬러줘야할 돈이 N원일 때 거슬러줘야 할 동전의 최소 개수를 구하라. 
거스름돈으로 사용할 동전은 500원, 100원, 50원, 10원, N은 10의 배수
*/

import java.util.Scanner;

public class StudyGreedy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int minCoinCnt = 0;
        int coins[] = {500, 100, 50, 10};

        for(int coin : coins) {
            minCoinCnt += (total/coin);
            total %= coin;
        }
        System.out.println("최소횟수: " + minCoinCnt);
    }
}
