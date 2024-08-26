class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Map<Integer,Integer>hmap = new HashMap<>();
        Map<Integer,Integer>hmap2 = new HashMap<>();
        int ans1 = 0;
        int ans2 = 0;
        for(int i=0;i<nums1.length;i++){
            hmap.put(nums1[i],1);
        }
        for(int i=0;i<nums2.length;i++){
            if(hmap.containsKey(nums2[i])) ans2++;
            hmap2.put(nums2[i],1);
        }
        for(int i=0;i<nums1.length;i++){
            if(hmap2.containsKey(nums1[i]))ans1++; 
        }
        int[]res = {ans1,ans2};
        return res;
    }
}