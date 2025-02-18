class Solution {
    public void search(int i, int j, char[][] grid, boolean[][] visited) {
        int m = grid.length, n = grid[0].length;
        Queue<Pair<Integer, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair<>(i, j));
        visited[i][j] = true;

        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        while (!queue.isEmpty()) {
            Pair<Integer, Integer> ij = queue.poll();
            int curri = ij.getKey();
            int currj = ij.getValue();

            for (int[] dir : directions) {
                int ni = curri + dir[0];
                int nj = currj + dir[1];

                if (ni >= 0 && ni < m && nj >= 0 && nj < n && grid[ni][nj] == '1' && !visited[ni][nj]) {
                    queue.offer(new Pair<>(ni, nj));
                    visited[ni][nj] = true; 
                }
            }
        }
    }

    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!visited[i][j] && grid[i][j] == '1') {
                    count++;
                    search(i, j, grid, visited);
                }
            }
        }
        return count;
    }
}
