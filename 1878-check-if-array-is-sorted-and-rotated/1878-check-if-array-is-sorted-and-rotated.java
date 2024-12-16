class Solution {
    public boolean check(int[] nums) {
        int rotatePos = 0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                rotatePos++;
            }
        }
        if(rotatePos==0) return true;
        if(rotatePos>1 ) return false;
        if(nums[0]<nums[nums.length-1]) return false;
        return true;

    }
}