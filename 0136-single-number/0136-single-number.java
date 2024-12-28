class Solution {
    public int singleNumber(int[] nums) {
     Map<Integer,Integer> hmap = new HashMap<>();
     for(int i=0;i<nums.length;i++){
        if(!hmap.containsKey(nums[i]))hmap.put(nums[i],1);
        else hmap.put(nums[i],hmap.get(nums[i])+1);
     }
     for(int i=0;i<nums.length;i++){
        int val = hmap.get(nums[i]);
        if(val==1) return nums[i];
     }   
     return 0;


    }
}