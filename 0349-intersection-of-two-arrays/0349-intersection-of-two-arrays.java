class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>hset = new HashSet<>();
        for(int a: nums1){hset.add(a);}
        List<Integer>arlist = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            if(hset.contains(nums2[i])){
                arlist.add(nums2[i]);
                hset.remove(nums2[i]);
            }
        }
        int res[] = new int[arlist.size()];
        for(int i=0;i<arlist.size();i++){
            res[i] = arlist.get(i);
        }
        return res;
    }
}