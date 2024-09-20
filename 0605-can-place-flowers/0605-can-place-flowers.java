class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0;
        if(n==0) return true;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]!=1){
                int before = (i==0 || flowerbed[i-1]==0)?0:1;
                int after = (i==flowerbed.length-1 || flowerbed[i+1]==0)?0:1;
                if(before==0 && after==0){
                    flowerbed[i] = 1;
                    c++;
                }
            }
        }
       
        return c>=n;
       
    }
}