class Solution {
    public int missingNumber(int[] nums) {
       int n = nums.length;
       int sum = 0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       }
       int expectedSum = (n*(n+1))/2; //6
       //System.out.println(expectedSum);
       //System.out.println(sum);
       int missingNumber = expectedSum - sum; // 6 - 4
       return missingNumber;
    }
}