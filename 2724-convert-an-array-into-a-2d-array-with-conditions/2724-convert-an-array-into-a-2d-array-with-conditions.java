class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        Map<Integer,Integer>hmap = new HashMap<>();
        List<List<Integer>>result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int freq = hmap.getOrDefault(nums[i],0);
            if(freq == result.size()){
                result.add(new ArrayList<>());
            }
            result.get(freq).add(nums[i]);
            if(!hmap.containsKey(nums[i])) hmap.put(nums[i],1);
            else hmap.put(nums[i],hmap.get(nums[i])+1);
        }
        return result;
    }
}