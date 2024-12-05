class Solution {
    public void nextPermutation(int[] nums) {
        int indx = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                indx = i;
                break;
            }
        }
        if(indx == -1){
            reverse(nums,0,nums.length-1);
        }else{
            for(int i=nums.length-1;i>indx;i--){
                if(nums[i]>nums[indx]){
                    int temp = nums[i];
                    nums[i] = nums[indx];
                    nums[indx] = temp;
                    reverse(nums,indx+1,nums.length-1);
                    break;
                }
            }

        }
    }

    public void reverse(int[]nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}