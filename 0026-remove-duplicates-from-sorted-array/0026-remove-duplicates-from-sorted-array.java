class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        // Map<Integer,Integer>hmap = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(!hmap.containsKey(nums[i])){
        //         hmap.put(nums[i],i);
        //         nums[count] = nums[i];
        //         count++;
        //     }
        // }
        // return count;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])continue;
            else{
                nums[count] = nums[i];
                count++;
            } 
        }
        return count;
    }
}