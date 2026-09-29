class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if ((m + n - 1) % 2 != 0 || grid[0][0] == ')') {
            return false;
        }

        int maxBalance = (m + n) / 2;
        boolean[][][] visited = new boolean[m][n][maxBalance + 1];

        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0, 1});
        visited[0][0][1] = true;

        int[][] dirs = {{1, 0}, {0, 1}};

        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int row = curr[0];
            int col = curr[1];
            int balance = curr[2];

            if (row == m - 1 && col == n - 1) {
                if (balance == 0) return true;
                continue;
            }

            for (int[] dir : dirs) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];

                if (newRow >= m || newCol >= n) continue;

                int newBalance = balance + (grid[newRow][newCol] == '(' ? 1 : -1);
                if (newBalance < 0 || newBalance > maxBalance) continue;

                if (!visited[newRow][newCol][newBalance]) {
                    visited[newRow][newCol][newBalance] = true;
                    queue.offer(new int[]{newRow, newCol, newBalance});
                }
            }
        }

        return false;
    }
}