// 연산 횟수가 N인 경우
public class 시간복잡도1 {
    public static void main(String[] args) {
        int N = 1000000;
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            System.out.println("연산 횟수:" + cnt++);
        }
    }
}

// 연산 횟수가 3N인 경우
public class 시간복잡도2 {
    public static void main(String[] args) {
        int N = 1000000;
        int cnt = 0; 
        for(int i = 0; i < N; i++) {
            System.out.println("연산 횟수:" + cnt++);
        }
        for(int i = 0; i < N; i++) {
            System.out.println("연산 횟수:" + cnt++);
        }
        for(int i = 0; i < N; i++) {
            System.out.println("연산 횟수:" + cnt++);
        }
    }
}

// 연산 횟수가 N^2인 경우
public class 시간복잡도3 {
    public static void main(String[] args) {
        int N = 1000000; 
        int cnt = 0;
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                System.out.println("연산 횟수:" + cnt++);
            }
        }
    }
}