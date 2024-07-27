class Solution {
    public int[][] largestLocal(int[][] grid) {
        int ans[][] = new int[grid.length-2][grid.length-2];
        int n = grid.length;
        for(int i=0;i<n-2;i++){
            for(int j=0;j<n-2;j++){
                ans[i][j] = getMaxElementOf3x3Matrix(i,j,grid);
            }
        }
        return ans;
    }

    public int getMaxElementOf3x3Matrix(int row, int col, int[][]grid){
        int maxEl = Integer.MIN_VALUE;
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                maxEl = Math.max(grid[i][j],maxEl);
            }
        }
        return maxEl;
    }
}