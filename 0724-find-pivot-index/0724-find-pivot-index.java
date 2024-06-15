class Solution {
    public int pivotIndex(int[] nums) {



        int tSum = 0;
        for(int i=0;i<nums.length;i++){
            tSum+=nums[i];
        }

        int tLsm = 0;
        for(int i=0;i<nums.length;i++){
            int ls = tLsm;
            int rs = (tSum - ls)-nums[i];

            if(ls==rs){
                return i;
            }
            tLsm+=nums[i];
        }
        return -1;
        
    }
}