class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0) return m*n;
        int rows = Integer.MAX_VALUE;
        int cols = Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++){
            rows = Math.min(rows,ops[i][0]);
            cols = Math.min(cols,ops[i][1]);          
        }
        int res = rows*cols;
        return res!=0?res:m*n;
    }
}