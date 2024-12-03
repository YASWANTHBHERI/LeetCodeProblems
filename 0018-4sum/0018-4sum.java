class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>> hset = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            long firstEl = nums[i];
            for(int j=i+1;j<nums.length;j++){
                long secEl = nums[j];
                int left = j+1;
                int right = nums.length-1;
                while(left<right){
                    long sum = firstEl + secEl + nums[left] + nums[right];
                    if(sum==target){
                        List<Integer>tempList = new ArrayList<>();
                        tempList.add((int)firstEl);
                        tempList.add((int)secEl);
                        tempList.add((int)nums[left]);
                        tempList.add((int)nums[right]);
                        hset.add(tempList);
                        left++;
                    } 
                    if(sum>target) right--;
                    else if(sum<target)left++;
                }
            }
        }
        List<List<Integer>>res = new ArrayList<>();
        for(List el: hset){
            res.add(el);
        }
        return res;
    }
}