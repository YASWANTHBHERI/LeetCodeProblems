class Solution {
    public int largestAltitude(int[] gain) {
        int maxEl = 0;
        int sum = 0;
        for(int i=0;i<gain.length;i++){
            sum = sum + gain[i];
            maxEl = Math.max(sum,maxEl);
        }
        return maxEl;
    }
}