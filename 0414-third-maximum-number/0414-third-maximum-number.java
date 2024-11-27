class Solution {
    public int thirdMax(int[] nums) {

       long firstMax = Long.MIN_VALUE;
       long secondMax = Long.MIN_VALUE;
       long thirdMax = Long.MIN_VALUE;
       
       for(int val: nums){
            if(val>firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = val;
            }else if(val>secondMax && val != firstMax){
                thirdMax = secondMax;
                secondMax = val;
            }else if(val>thirdMax && val!=secondMax && val!=firstMax){
                thirdMax = val;
            }
       }
       if(nums.length<3) return (int) firstMax;
       if(thirdMax==Long.MIN_VALUE) return (int) firstMax;
       return (int) thirdMax;
    }
}