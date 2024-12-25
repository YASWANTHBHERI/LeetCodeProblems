class Solution {
    public void rotate(int[] nums, int k) {

        if(nums.length ==1 || nums.length==0) return;
        if(k>nums.length)k = k%nums.length;
        // int start = 0;
        // int end = nums.length-1;

        // int i = 0;
        // int j = k-1;

        // int l = k;
        // int m = nums.length-1;
        // swap(nums,start,end);
        // swap(nums,i,j);
        // swap(nums,l,m);   

        swap(nums,0,nums.length-1);
        swap(nums,0,k-1);
        swap(nums,k,nums.length-1);      
    }

    static void swap(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}