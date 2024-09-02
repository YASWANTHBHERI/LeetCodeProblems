class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer,Integer>hmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hmap.put(nums[i],i);
        }
        List<Integer>arList = new ArrayList<>();
        for(int i=1;i<nums.length+1;i++){
            if(hmap.get(i) == null) arList.add(i);
        }
        return arList;
    }
}