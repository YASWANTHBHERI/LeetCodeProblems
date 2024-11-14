class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> hmap1 = new HashMap<>();
        Map<Integer,Integer> hmap2 = new HashMap<>();

        for(int i=0;i<nums1.length;i++){
            if(!hmap1.containsKey(nums1[i])){
                hmap1.put(nums1[i],1);
            }else {
                hmap1.put(nums1[i],hmap1.get(nums1[i])+1);
                nums1[i] = -1;
            }
        }

        for(int i=0;i<nums2.length;i++){
            if(!hmap2.containsKey(nums2[i])){
                hmap2.put(nums2[i],1);
            }else{
                hmap2.put(nums2[i],hmap2.get(nums2[i])+1);
                nums2[i] = -1;   
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]!=-1 && hmap2.containsKey(nums1[i])){
                int count1 = hmap1.get(nums1[i]);
                int count2 = hmap2.get(nums1[i]);

                if(count1>count2){
                    int sum = Math.min(count1,count2);
                    while(sum>0){
                        ans.add(nums1[i]);
                        sum--;
                    }
                }else if(count1<count2){
                    int sum = Math.min(count1,count2);
                    while(sum>0){
                        ans.add(nums1[i]);
                        sum--;
                    }
                }
                else{
                    int sum = count1;
                    while(sum>0){
                        ans.add(nums1[i]);
                        sum--;
                    }
                }
            }
        }

        int[] res = new int[ans.size()];
        for(int i=0;i<res.length;i++){
            res[i] = ans.get(i);
        }
        return res;


    }
}