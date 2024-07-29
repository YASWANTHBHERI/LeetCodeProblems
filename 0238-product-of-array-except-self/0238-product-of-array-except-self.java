class Solution {
    public int[] productExceptSelf(int[] nums) {
        int res[] = new int[nums.length];
        int ls[] = new int[nums.length];
        int rs[] = new int[nums.length];
        ls[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            ls[i] = nums[i] * ls[i-1];
        }
        rs[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            rs[i] = nums[i]*rs[i+1];
        }
        
        res[0] = rs[1];
        res[nums.length-1] = ls[nums.length-2];
        for(int i=1; i<nums.length-1;i++){
            res[i] = ls[i-1] * rs[i+1];
        }
        return res;
        
    }
}