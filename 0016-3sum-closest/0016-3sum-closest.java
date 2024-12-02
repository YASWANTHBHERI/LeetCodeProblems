class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans = 0;
        int diff = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int left = i+1;
            int right = nums.length-1;
            int curr = nums[i];
            while(left<right){
                int sum = curr+nums[left]+nums[right];
                int mindiff = Math.abs(sum-target);
                if(mindiff == 0) return target; 
                if(mindiff<diff){
                    diff = mindiff;
                    ans = sum;
                }
                if(sum<target) left++;
                if(sum>target) right--;
            }
        }
        return ans;
        

    }
}