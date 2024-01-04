import java.util.LinkedList;
import java.util.Queue;

public class StudyBFS {
	
	public static void main(String[] args) {
		int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
		
		boolean[] visited = new boolean[9];
		
		System.out.println(bfs(1, graph, visited));
	}
	
	static String bfs(int start, int[][] graph, boolean[] visited) {
		StringBuilder sb = new StringBuilder();
		// 큐 생성
		Queue<Integer> q = new LinkedList<Integer>();
		 
		// 시작 할 노드 번호 큐에 넣기
		q.offer(start);
		
		// 시작노드 방문처리
		visited[start] = true;
		
		// 큐가 빌 때까지 반복
		while(!q.isEmpty()) {
			int nodeIndex = q.poll();
			sb.append(nodeIndex + " ");
			//큐에서 꺼낸 노드와 연결된 노드들 체크
			for(int i=0; i<graph[nodeIndex].length; i++) {
				int temp = graph[nodeIndex][i];
				// 방문하지 않았으면 방문처리 후 큐에 넣기
				if(!visited[temp]) {
					visited[temp] = true;
					q.offer(temp);
				}
			}
		}
		return sb.toString() ;
	}
}