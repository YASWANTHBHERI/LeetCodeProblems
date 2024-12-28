class Solution {
    public int singleNumber(int[] nums) {
     int xor = 0;
     for(int i=0;i<nums.length;i++){
        // System.out.println(xor+" "+nums[i]);
        xor = xor^nums[i];
        // System.out.println("xor"+xor);
     }
     return xor;


    }
}