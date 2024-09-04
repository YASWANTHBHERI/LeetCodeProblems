class Solution {
    public List<String> summaryRanges(int[] nums) {
        int s = 0;
        List<String>arlist = new ArrayList<>();
        for(int i=1;i<=nums.length;i++){
            if(i==nums.length || nums[i-1]+1 != nums[i]){
                if(s == i-1) arlist.add(String.valueOf(nums[s]));
                else arlist.add(nums[s]+"->"+nums[i-1]);
                 s=i;
            }
           
        }
        return arlist;
    }
}