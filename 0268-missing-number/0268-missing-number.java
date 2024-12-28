class Solution {
    public int missingNumber(int[] nums) {
        Map<Integer,Integer>hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
                hmap.put(nums[i],nums[i]);
        }
        for(int i=1;i<=nums.length;i++){
            if(!hmap.containsKey(i)) return i;
        }
        return 0;
    }
}