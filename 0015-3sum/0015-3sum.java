class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3 || nums == null) return new ArrayList<>();
        Set<List<Integer>>hashSet = new HashSet<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++){
            int curr = nums[i];
            int left = i+1;
            int right = nums.length-1;
            while(left<right){
                int sum = curr + nums[left] + nums[right];
                if(sum==0){
                    List<Integer>newList = new ArrayList<>();
                    newList.add(curr);
                    newList.add(nums[left]);
                    newList.add(nums[right]);
                    hashSet.add(newList);
                    left++;
                    right--;
                }
                else if(sum<0) left++;
                else right--;
            }
        }
        return new ArrayList<>(hashSet);
    }
}