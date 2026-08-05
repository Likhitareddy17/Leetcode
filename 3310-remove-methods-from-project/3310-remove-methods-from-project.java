
import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

class Solution {
    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        // Step 0: Build the adjacency list graph
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] edge : invocations) {
            graph.get(edge[0]).add(edge[1]);
        }

        // Step 1: Find all suspicious methods using BFS starting from method k
        boolean[] suspicious = new boolean[n];
        suspicious[k] = true;
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(k);

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int neighbor : graph.get(curr)) {
                if (!suspicious[neighbor]) {
                    suspicious[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }

        // Step 2: Check if any non-suspicious method invokes a suspicious method
        for (int u = 0; u < n; u++) {
            if (!suspicious[u]) {
                for (int v : graph.get(u)) {
                    if (suspicious[v]) {
                        // Violation detected: return all methods intact
                        List<Integer> allMethods = new ArrayList<>(n);
                        for (int i = 0; i < n; i++) {
                            allMethods.add(i);
                        }
                        return allMethods;
                    }
                }
            }
        }

        // Step 3: Collect and return only non-suspicious methods
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!suspicious[i]) {
                result.add(i);
            }
        }
        return result;
    }
}