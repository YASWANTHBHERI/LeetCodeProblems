class Solution {
    public int arrangeCoins(int n) {
        long totalCoins = n;
        long i = 1;
        while(i<totalCoins){
            totalCoins = totalCoins-i;
            if(i>=totalCoins) return (int) i; 
            i++;
        }
        return (int) i;
    }
}