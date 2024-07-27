class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;

        for(int i=1;i<nums.length;i++){
            if(i>1 && nums[i]==nums[count-1] && nums[i]==nums[count-2]){
                continue;
                // nums[i] = Integer.MAX_VALUE;
            }
            else{
                nums[count] = nums[i];
                count++;
            }
        }
        // Arrays.sort(nums);
        return count;
    }
}