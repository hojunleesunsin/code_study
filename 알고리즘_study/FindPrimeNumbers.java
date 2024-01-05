/* 
- 소수란?
자신보다 작은 2개의 자연수를 곱해 만들 수 없는 1보다 큰 자연수를 말한다.
같은 의미로 자기 자신 외에 약수가 존재하지 않는 수를 말한다.

소수 구하는 대표적인 판별법 => 에라토스테네스의 체
에라토스테네스의 체는 시간복잡도가 이중 for문을 사용하므로 O(N^2) 정도로 예상할 수 있지만
실제 시간 복잡도는 일반적으로 O(Nlog(logN))이다.
그 이유는 배수를 삭제하는 연산으로 바깥쪽 for문을 생략하는 경우가 빈번하게 발생하기 때문이다.


- 에라토스테네스의 체 원리
1. 구하고자 하는 소수의 범위만큼 1차원 배열을 생성한다.
2. 2부터 시작하고 현재 숫자가 지워지지 않을 때는 현재 선택된 숫자의 배수에
해당하는 수를 배열에서 끝까지 탐색하면서 지운다. 
**** 이때 처음으로 선택된 숫자는지우지 않는다. ****  <=== 소수
3. 배열의 끝까지 2번을 반복한 후 배열에서 남아 있는 모든 수를 출력한다.
*/

import java.util.Scanner;

public class FindPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(isPrime(input) == true ? "소수 입니다." : "소수가 아닙니다.");
    }    
    
    public static boolean isPrime(int input) {
        if (input <= 1) return false;
        for(int i = 2; i < input; i++) {
            if(input % i == 0) return false;
        }
        return true;
    }
}
