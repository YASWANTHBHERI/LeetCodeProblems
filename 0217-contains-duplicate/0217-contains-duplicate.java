class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>hset = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!hset.contains(nums[i])){
                hset.add(nums[i]);
            }
            else return true;
        }
        return false;
    }
}