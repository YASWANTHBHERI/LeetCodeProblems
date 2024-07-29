class Solution {
    public int jump(int[] nums) {
        if(nums.length==1) return 0;
        int jumps = 0;
        int lastJumpIndx = 0;
        int max_jumps = 0;
        for(int i=0;i<nums.length;i++){
            max_jumps = Math.max(max_jumps,nums[i]+i);
            if(i==lastJumpIndx){
                lastJumpIndx = max_jumps;
                jumps++;
                if(max_jumps>=nums.length-1) return jumps;
            }
        }
        return jumps;
    }

}
