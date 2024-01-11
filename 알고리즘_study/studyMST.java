/*
최소 신장 트리(Minimim Spanning Tree(MST))
크루스칼 알고리즘 = 최소 신장 트리를 찾는 알고리즘
-> 크루스칼 알고리즘은 기본적으로 그리디한 선택을 바탕으로 알고리즘을 진행한다.
시간복잡도 = O(ElogV)

크루스칼 알고리즘 순서
1. 주어진 그래프의 모든 간선에 대해서, 간선의 연결비용을 낮은 순으로 오름 차순 정렬한다.
2. 정렬된 간선 순서대로 선택하면서, 간선의 양 끝 정점을 Union 한다. 
단, 이때 선택된 두 정점이 같은 집합에 속해있다면 사이클(cycle)이 있다고 판단하고 포함시키지 않는다.

이러한 매커니즘을 바탕으로 최종 선택된 간선을 연결한 것이 최소 비용 신장트리이다.

** 크루스칼 알고리즘은 서로소 집합에 대해서 먼저 명확히 이해하고 있어야만 한다. **
 */

 /*
** 입력 예시
6   //정점의 개수
9   // 간선의 개수
1 6 5
2 4 6
1 2 7
3 5 15
5 6 9
3 4 10
1 3 11
2 3 3
4 5 7
  */

import java.util.Arrays;
import java.util.Scanner;

public class studyMST {

    static int V, E;
    static int[][] graph;
    static int[] parent;
    static int final_cost;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        graph = new int[E][3];
        for(int i = 0; i < E; i++) {
            graph[i][0] = sc.nextInt();
            graph[i][1] = sc.nextInt();
            graph[i][2] = sc.nextInt();
        }
        parent = new int[V];
        final_cost = 0;

        // 간선 비용 순 오름차순 정렬
        Arrays.sort(graph, (o1, o2) -> Integer.compare(o1[2], o2[2]));

        for(int i = 0; i < V; i++) {
            parent[i] = i;
        }

        // 낮은 비용부터 크루스칼 알고리즘 수행
        for(int i = 0; i < E; i++) {
            // 사이클이 존재하지 않는 경우에만 간선 선택
            if(find(graph[i][0] - 1) != find(graph[i][1] -1)) {
                System.out.println("선택된 간선");
                System.out.println(Arrays.toString(graph[i]));
                union(graph[i][0] - 1, graph[i][1] - 1);
                final_cost += graph[i][2];
                System.out.println("각 노드가 가리키고 있는 부모: " 
                + Arrays.toString(parent));
                continue;
            }
        }
        System.out.println("최종 비용: " + final_cost);
    }
    public static boolean union(int a, int b) {
        a = find(a); 
        b = find(b); 

        if(a == b) return false;
        else parent[b] = a;
        return true;
    }

    public static int find(int a) {
        if(parent[a] == a) return a;
        return find(parent[a]);
    }
}
