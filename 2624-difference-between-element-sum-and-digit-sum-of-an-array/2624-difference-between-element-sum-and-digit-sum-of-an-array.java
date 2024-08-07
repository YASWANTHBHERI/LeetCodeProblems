class Solution {
    public int differenceOfSum(int[] nums) {
        int els = 0;
        int ds =0;
        for(int i=0;i<nums.length;i++){
            els+=nums[i];
            if(nums[i]>9){
                int x = nums[i];
                int s = 0;
                while(x!=0){
                    s = x%10;
                    ds+=s;
                    x/=10;
                }
            }
            else ds+=nums[i];
        }
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]>9){
        //         int x = nums[i];
        //         int s = 0;
        //         while(x!=0){
        //             s = x%10;
        //             ds+=s;
        //             x/=10;
        //         }
        //     }
        //     else ds+=nums[i];
        // }
        return Math.abs(els-ds);
    }
}