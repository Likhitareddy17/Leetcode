class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       int m=grid.length;//rows
       int n=grid[0].length;//columns
        int total=m*n;
        k=k%total;
       int[][] temp = new int[m][n]; // grid of size m x n

for (int r = 0; r < m; r++) {
    for (int c = 0; c < n; c++) {
        int new1D = (r * n + c + k) % total;
        temp[new1D / n][new1D % n] = grid[r][c]; // Direct index access 
    }
}

// Converting 2D array to List<List<Integer>> 
List<List<Integer>> result = new ArrayList<>();
for (int[] row : temp) {
    List<Integer> listRow = new ArrayList<>();
    for (int val : row) listRow.add(val);
    result.add(listRow);
}

return result;
    }
}