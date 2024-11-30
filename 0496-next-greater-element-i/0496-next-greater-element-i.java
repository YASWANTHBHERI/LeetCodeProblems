class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] arr = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            int val1 = nums1[i];
            for(int j=0;j<nums2.length;j++){
                if(val1==nums2[j]){
                    int index = j;
                    arr[i] = -1;
                    while(index<nums2.length){
                        if(nums2[index]>val1){
                            arr[i] = nums2[index];
                            break;
                        }
                        index++;
                    }
                }
            }
        }
        return arr;
    }
}