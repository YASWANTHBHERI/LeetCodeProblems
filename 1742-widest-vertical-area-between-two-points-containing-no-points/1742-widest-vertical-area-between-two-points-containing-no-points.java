class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int maxWidth = 0;

        int[] arr = new int[points.length];
        for(int i=0;i<points.length;i++){
            arr[i] = points[i][0]; 
        }
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++){
            int diff = Math.abs(arr[i]-arr[i+1]);
            if(diff>maxWidth) maxWidth = diff;
        }
        return maxWidth;
    }
}