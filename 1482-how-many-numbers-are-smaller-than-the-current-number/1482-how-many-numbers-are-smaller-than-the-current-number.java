class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer> hmap = new HashMap<>();
        int[] newArr = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            newArr[i] = nums[i];
        }
        Arrays.sort(newArr);
        for(int i=0;i<nums.length;i++){
            if(hmap.containsKey(newArr[i])){
                hmap.put(newArr[i],hmap.get(newArr[i]));
            }
            else hmap.put(newArr[i],i);
        }
        int res[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i] = hmap.get(nums[i]);
        }
        return res;
    }
}