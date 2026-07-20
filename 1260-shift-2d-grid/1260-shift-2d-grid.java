class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int total = m * n;
        k %= total;
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int flatIndex = (i * n + j - k + total) % total;
                int originalRow = flatIndex / n;
                int originalCol = flatIndex % n;
                row.add(grid[originalRow][originalCol]);
            }
            result.add(row);
        }
        return result;
    }
}