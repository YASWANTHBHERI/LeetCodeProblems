class Solution {
    public boolean canJump(int[] nums) {
        int max_jump = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]+i > max_jump) max_jump = nums[i] + i;
            if(i>=max_jump) return false;
        }
        return true;
    }
}