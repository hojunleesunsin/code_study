/*
- 유클리드 호제법(Euclidean-algorithm)
두 수의 최대 공약수를 구하는 알고리즘
MOD 연산은 최대 공약수를 구하는데 사용하는 핵심 연산이다.

- MOD 연산으로 구현하는 유클리드 호제법
1. 큰 수를 작은 수로 나누는 MOD 연산을 수행한다.
2. 앞 단계에서의 작은 수와 MOD 연산 결괏값(나머지)으로 MOD 연산을 수행한다.
3. 단계 2번을 반복하다가 나머지가 0이 되는 순간의 작은 수를 최대 공약수로 선택한다.
 */

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        System.out.println("최대 공약수: " + gcd(6, 15));
        System.out.println("최소 공배수: " + lcm(6, 15));
    }

    // 최대 공약수
    public static int gcd(int a, int b) {
        if(b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    // 최소 공배수
    public static int lcm(int a, int b) {
        return a*b / gcd(a, b);
    }
}
