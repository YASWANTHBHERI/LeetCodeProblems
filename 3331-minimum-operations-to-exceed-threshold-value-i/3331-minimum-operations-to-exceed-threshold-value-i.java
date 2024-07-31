class Solution {
    public int minOperations(int[] nums, int k) {
        int operations = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k) operations++;
        }
        return operations;
    }
}