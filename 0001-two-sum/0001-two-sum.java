class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int sum = target - nums[i];
            if(hmap.containsKey(sum)){
                return new int[]{hmap.get(sum),i};
            }
            if(!hmap.containsKey(nums[i]))hmap.put(nums[i],i);
        }
        return null;
    }
}