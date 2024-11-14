class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freqArr = new int[1001];

        for(int num: nums1){
            freqArr[num]++;
        }
        ArrayList<Integer>ans = new ArrayList<>();
        for(int num: nums2){
            if(freqArr[num]>0){
                ans.add(num);
                freqArr[num]--;
            }
        }
        int [] res = new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i] = ans.get(i);
        }
        return res;
    }
}