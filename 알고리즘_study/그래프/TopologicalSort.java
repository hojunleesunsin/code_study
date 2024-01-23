// 위상 정렬 java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSort {
    static int n;
    public static void main(String[] args) {
        n = 7; // 정점 갯수
        int[] indegree = new int[n+1];
        List<List<Integer>> arr = new ArrayList<List<Integer>>();

        for(int i = 0; i <= n; i++) {
            arr.add(new ArrayList<Integer>());
        }

        // input1 -> input2
        int[] input1 = {1, 1, 2, 4, 3, 3, 5, 2, 5};
        int[] input2 = {2, 3, 5, 6, 4, 7, 6, 4, 4};

        for(int i = 0; i < input1.length; i++) {
            int node1 = input1[i];
            int node2 = input2[i];

            arr.get(node1).add(node2);
            indegree[node2]++;
        }
        topologicalSort(indegree, arr); 
    }

    static void topologicalSort(int[] indegree, List<List<Integer>> arr) {
        Queue<Integer> q = new LinkedList<Integer>();
        Queue<Integer> result = new LinkedList<Integer>();

        for(int i = 1; i <= n; i++) {
            if(indegree[i] == 0) {
                q.offer(i);
            }
        }

        while (!q.isEmpty()) {
            int node = q.poll();
            result.offer(node);

            for(Integer i : arr.get(node)) {
                indegree[i]--;

                if(indegree[i] == 0) {
                    q.offer(i);
                }
            }
        }
        System.out.println(result);
    }
}
