class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer>arrList = new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            if(i%2==0){
                for(int j=0;j<nums[i];j++){
                    arrList.add(nums[i+1]);
                }
            }
        }
        int ans[] = new int[arrList.size()];
        for(int i=0;i<arrList.size();i++){
            ans[i] = arrList.get(i);
        }
        return ans;
    }
}