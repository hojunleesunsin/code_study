// 인접 리스트 양방향 무가중치

import java.util.ArrayList;

public class AdjacencyList {
    public static void print(ArrayList<ArrayList<Integer>> graph) {
        for (int i = 1; i < graph.size(); i++) {
            ArrayList<Integer> node = graph.get(i);
            System.out.print("node" + "[" + i + "] : ");
            for (int j = 0; j < node.size(); j++)
                System.out.print(node.get(j) + " ");
            System.out.println();
        }
    }

    public static void putEdge(ArrayList<ArrayList<Integer>> graph, int a, int b) {
        graph.get(a).add(b);
        graph.get(b).add(a);
    }

    public static void main(String[] args) {
        int n = 5; // 그래프 정점의 개수
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i <= n; i++) 
            graph.add(new ArrayList<>()); // 각 노드 별 리스트를 만들어준다.
        putEdge(graph, 1, 2);
        putEdge(graph, 1, 3);
        putEdge(graph, 1, 4);
        putEdge(graph, 2, 3);
        putEdge(graph, 2, 5);
        putEdge(graph, 3, 4);
        putEdge(graph, 4, 5);

        print(graph);

    }
}
