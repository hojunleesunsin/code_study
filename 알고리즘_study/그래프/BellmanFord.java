import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
벨만-포드

** 입출력 예시 **
입력
5
9
1 2 10
1 3 5
2 3 2
3 1 1
3 2 13
4 1 8
4 5 3
5 4 9
5 2 31
출력결과
8 18 13 0 3 

음수 사이클있는 그래프
입력
5
9
1 2 -10
1 3 5
2 3 2
3 1 1
3 2 13
4 1 8
4 5 3
5 4 9
5 2 31
출력 결과
음수 사이클 존재
 */

class Edge {
	int v; // 나가는 정점
	int w; // 들어오는 정점
	int cost;

	public Edge(int v, int w, int cost) {
		this.v = v;
		this.w = w;
		this.cost = cost;
	}
}

public class BellmanFord {
	static ArrayList<Edge> graph;
	static final int INF = 1000000000;
	
	//정점의 개수, 간선의 개수, 출발지
	public static boolean bellmanFord(int n, int m, int start) {
		int[] dist = new int[n + 1];
		Arrays.fill(dist, INF);
		dist[start] = 0;

		//정점의 개수만큼 반복
		for (int i = 0; i < n; i++) {
			//간선의 개수만큼 반복
			for (int j = 0; j < m; j++) {
				Edge edge = graph.get(j); //현재 간선
				
				//현재 간선의 들어오는 정점에 대해 비교
				if (dist[edge.v] != INF && dist[edge.w] > dist[edge.v] + edge.cost) {
					dist[edge.w] = dist[edge.v] + edge.cost;
				}
			}
		}
		
		//음수 가중치 확인
		for (int i = 0; i < m; i++) {
			Edge edge = graph.get(i); //현재 간선
			
			//현재 간선의 들어오는 정점에 대해 비교 -> 더 작은 값 생기면 음수 사이클 존재
			if (dist[edge.v] != INF && dist[edge.w] > dist[edge.v] + edge.cost) {
				System.out.println("음수 사이클 존재");
				return false;
			}
		}
		
		//출력
		for (int i = 1; i < dist.length; i++) {
			if (dist[i] == INF)
				System.out.print("INF ");
			else
				System.out.print(dist[i] + " ");
		}
		
		return true;
	}

	public static void main(String[] args) throws IOException {
    
    //그래프 입력받기
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		// 정점의 개수, 간선의 개수 
        System.out.print("정점의 개수를 입력해 주세요 >> ");
		int n = Integer.parseInt(bf.readLine());
        System.out.print("간선의 개수를 입력해 주세요 >> ");
		int m = Integer.parseInt(bf.readLine());

		graph = new ArrayList<>();

		StringTokenizer st;
		for (int i = 0; i < m; i++) {
            System.out.print("정점1 정점2 가중치 입력 >> ");
			st = new StringTokenizer(bf.readLine());
			int v = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());

			graph.add(new Edge(v, w, cost));
		}
		
        //벨만-포드 알고리즘 수행
		bellmanFord(n, m, 4);
	}
}