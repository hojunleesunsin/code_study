/* 
- 이진 탐색(binary search)
데이터가 정렬돼 이는 상태에서 원하는 값을 찾아내는 알고리즘.
대상 데이터의 중앙값과 찾고자 하는 값을 비교해 데이터의 크기를 절반씩 줄이면서
대상을 찾는다.

기능: 타깃 데이터 탐색
특징: 중앙값 비교를 통한 대상 축소 방식
시간 복잡도: O(logN)

이진탐색은 정렬 데이터에서 원하는 데이터를 탐색할 때 사용하는 
가장 일반적인 알고리즘이다. 구현 및 원리가 비교적 간단하다.

1. 현재 데이터셋의 중앙값을 선택한다.
2. 중앙값 > 타깃 데이터일 때 중앙값 기준으로 왼쪽 데이터셋을 선택한다.
3. 중앙값 < 타깃 데이터일 때 중앙값 기준으로 오른쪽 데이터셋을 선택한다.
4. 1~3 과정을 반복하다가 중앙값 == 타깃 데이터일 때 탐색을 종료한다.
*/

public class BinarySearch {
    static int[] arr = { 1, 4, 7, 15, 26, 35, 55, 72, 88, 98, 100 };
    public static void main(String[] args) {
        System.out.println(binarySearch(55, 0, arr.length-1));
        
    }

    static int binarySearch(int find, int left, int right) {
        int mid;

        while (left <= right) {
            mid = (left+right) / 2;

            if(find == arr[mid]) {
                return mid;
            }

            if(find < arr[mid]) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}