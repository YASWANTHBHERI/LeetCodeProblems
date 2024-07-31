class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       List<Integer> arrList = new ArrayList<>();
       int [] targetArr = new int[nums.length];
       for(int i=0;i<nums.length;i++){
            arrList.add(index[i],nums[i]);
       }
       for(int i=0;i<arrList.size();i++){
            targetArr[i] = arrList.get(i);
       }
       return targetArr;
       
    }
}