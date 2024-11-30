class Solution {
    public int arrayPairSum(int[] nums) {
        
        Arrays.sort(nums);
        int max = 0;
        for(int i=0;i<nums.length-1;i+=2){
            int min = Math.min(nums[i],nums[i+1]);
            max+=min;
        }
        return max;
        
    }
}