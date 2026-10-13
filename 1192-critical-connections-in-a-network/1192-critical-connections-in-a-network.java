class Solution {
    private static int timer = 1;
    
    private static void dfs(int u, int p, List<List<Integer>> adj, int[] tin, int[] low,
        boolean[] vis, List<List<Integer>> bridges) {
        vis[u] = true;
        tin[u] = low[u] = timer++;
        for (int v : adj.get(u)) {
            if (v == p)
                continue;
            if (vis[v]) {
                low[u] = Math.min(low[u], tin[v]);
            } else {
                dfs(v, u, adj, tin, low, vis, bridges);
                low[u] = Math.min(low[u], low[v]);
                if (low[v] > tin[u]) {
                    bridges.add(Arrays.asList(u, v));
                }
            }
        }
    }

    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<>());
        for (List<Integer> edge : connections) {
            adj.get(edge.get(0)).add(edge.get(1));
            adj.get(edge.get(1)).add(edge.get(0));
        }
        int[] tin = new int[n];
        int[] low = new int[n];
        boolean[] vis = new boolean[n];
        List<List<Integer>> bridges = new ArrayList<>();
        dfs(0, -1, adj, tin, low, vis, bridges);
        return bridges;
    }
}