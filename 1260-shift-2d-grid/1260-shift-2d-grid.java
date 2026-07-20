class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
       int m=grid.length;//rows
       int n=grid[0].length;//columns
        int total=m*n;
        k=k%total;
        List<List<Integer>> result =new ArrayList<>();
         for (int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(0);
            }
            result.add(row);
        }
        
        // Map every 2D coordinate -> 1D index -> shifted 1D index -> new 2D coordinate
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                // 1. Convert 2D to 1D index
                int old1D = r * n + c;
                
                // 2. Right shift in 1D
                int new1D = (old1D + k) % total;
                
                // 3. Convert back to 2D index
                int newR = new1D / n;
                int newC = new1D % n;
                
                // Place element in the target location
                result.get(newR).set(newC, grid[r][c]);
            }
        }
        
        return result;
    }
}