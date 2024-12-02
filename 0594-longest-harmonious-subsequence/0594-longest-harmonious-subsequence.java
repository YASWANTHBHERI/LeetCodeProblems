class Solution {
    public int findLHS(int[] nums) {
        int ans = 0;
        Map<Integer,Integer>hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hmap.containsKey(nums[i])) hmap.put(nums[i],1);
            else hmap.put(nums[i],hmap.get(nums[i])+1);
        }

        for(int i=0;i<nums.length;i++){
            int val = nums[i]+1;
            if(hmap.containsKey(val)){
                ans = Math.max(ans,hmap.get(nums[i])+hmap.get(val));
            }
        }
        return ans;
    }
}