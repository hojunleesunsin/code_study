import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
플로이드-워셜

 ** 입력 예시
5
14 
1 2 2 
1 3 3 
1 4 1 
1 5 10 
2 4 2 
3 4 1 
3 5 1 
4 5 3 
3 5 10 
3 1 8 
1 4 2 
5 1 7 
3 4 2 
5 2 4

** 출력 예시
0 2 3 1 4 
12 0 15 2 5 
8 5 0 1 1 
10 7 13 0 3 
7 4 10 6 0
 */


public class FloydWarshall{
	public static void main(String[] args)  throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		
		final int MAX = 100000001;	// 비용이 100,000 이하이고, 도시의 최대 개수는 100개 이므로 최대 비용은 1억을 넘지 않는다.
		
		int n = Integer.parseInt(st.nextToken());	// 도시의 수 n(1 ≤ n ≤ 100)
		
		st = new StringTokenizer(br.readLine().trim());
		int m = Integer.parseInt(st.nextToken());	// 버스의 개수 m (1 ≤ m ≤ 100,000)
		
		int[][] dist = new int[n+1][n+1];	// 도시간 이동 비용. 입력받은 도시간 이동 비용을 초기값으로 입력. 시작 도시 a, 도착 도시 b, 한 번 타는데 필요한 비용 c
		
		// dist 초기화
		for (int i=1 ; i<=n ; i++) {
			for (int j=1 ; j<=n ; j++) {
				if (i==j) {
					dist[i][j] = 0;
				} else {
					dist[i][j] = MAX ;
				}
			}
		}
		
		
		for (int i=1 ; i<=m ; i++) {
			st = new StringTokenizer(br.readLine().trim());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			dist[a][b] = Math.min(dist[a][b], c);	// 도시간 이동 비용 설정. 여러번 입력받을 수 있으므로 그 중 작은 값으로 설정
		}
		
		for (int k=1 ; k<=n ; k++) {
			for (int i=1 ; i<=n ; i++) {
				for (int j=1 ; j<=n ; j++) {
					if (dist[i][j] > dist[i][k] + dist[k][j]) {
						dist[i][j] = dist[i][k] + dist[k][j];
					}
				}
			}
		}
		
		StringBuffer sb ;
		for (int i=1 ; i<=n ; i++) {
			sb = new StringBuffer();
			for (int j=1 ; j<=n ; j++) {
				if (dist[i][j] == MAX) {
					sb.append("0 ");
				} else {
					sb.append(dist[i][j] + " ");
				}
			}
			System.out.println(sb.toString().trim());
		}		
	}
}