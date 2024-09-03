class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
       
        if(m*n != original.length){
            int[][] empty = {};
            return empty;
        }
        int[][] ans = new int[m][n];
        int c = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans[i][j] = original[c];
                c++;
            }
        }
        
        return ans;
    }
}