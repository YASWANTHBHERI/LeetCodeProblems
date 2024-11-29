class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int cs = 0;
        int temp = 0;

        for(int i=0;i<nums.length;i++){
           if(nums[i]==1){
                temp++;
                cs = Math.max(temp,cs);
           }else temp = 0;
        }
        return cs;
    }
}