class Solution {
    public int numberOfPairs(int[] nums1, int[] nums2, int k) {
        
        int i=0;
        int j=0;
        int pairs = 0;

        while(i<nums1.length){
            int dividend = nums1[i];
            int divisor = nums2[j] * k;

            if(dividend % divisor == 0){
                pairs++;
            }
            j++;
            if(j==nums2.length){
                j=0;
                i++;
            } 
        }
        return pairs;
    }
}