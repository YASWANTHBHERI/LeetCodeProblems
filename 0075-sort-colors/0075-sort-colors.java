class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        sort(nums,low,high);
    }
    public void sort(int[]nums,int low, int high){
        if(low<high){
            int pIndex = partition(nums,low, high);
            sort(nums,low, pIndex-1);
            sort(nums,pIndex+1,high);

        }
    }
    public int partition(int[] nums,int low, int high){
        int pivot = low;
        int i = low;
        int j = high;
        while(i<j){
            while(nums[i]<=nums[pivot] && i<=high-1){
                i++;
            }
            while(nums[j]>nums[pivot] && j>=low+1){
                j--;
            }
            if(i<j) swap(nums,i,j);
        }
        swap(nums,pivot,j);
        return j;
    }
    public void swap(int[] nums, int firstIndex, int secondIndex){
        int temp = nums[firstIndex];
        nums[firstIndex] = nums[secondIndex];
        nums[secondIndex] = temp;
    }
}