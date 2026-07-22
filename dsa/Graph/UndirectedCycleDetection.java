import java.util.*;

public class UndirectedCycleDetection {

    public boolean hasWiringLoop(Map<Integer, List<Integer>> graph, int n) {

        Set<Integer> visited = new HashSet<>();

        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                if (dfs(graph, i, -1, visited))
                    return true;
            }
        }

        return false;
    }

    private boolean dfs(Map<Integer, List<Integer>> graph,
                        int node,
                        int parent,
                        Set<Integer> visited) {

        visited.add(node);

        for (int neighbor : graph.getOrDefault(node, Collections.emptyList())) {

            if (!visited.contains(neighbor)) {
                if (dfs(graph, neighbor, node, visited))
                    return true;
            } else if (neighbor != parent) {
                return true;
            }
        }

        return false;
    }
}
