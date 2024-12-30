class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hmap.containsKey(nums[i]))hmap.put(nums[i],1);
            else hmap.put(nums[i],hmap.get(nums[i])+1);
        }
        int maxEl = 0;
        int count  = 0;
        for(int i=0;i<nums.length;i++){
            if(hmap.get(nums[i])>count){
                count = hmap.get(nums[i]);
                maxEl = nums[i];
            }
        }
        return maxEl;
    }
}