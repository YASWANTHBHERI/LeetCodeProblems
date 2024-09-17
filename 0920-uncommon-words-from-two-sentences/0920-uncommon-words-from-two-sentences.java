class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[]arr1 = s1.split(" ");
        String[]arr2 = s2.split(" ");
        
        Map<String,Integer>hmap = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(!hmap.containsKey(arr1[i])){
                hmap.put(arr1[i],1);
            }else hmap.put(arr1[i],hmap.get(arr1[i])+1);
        }
        for(int i=0;i<arr2.length;i++){
            if(!hmap.containsKey(arr2[i])){
                hmap.put(arr2[i],1);
            }else hmap.put(arr2[i],hmap.get(arr2[i])+1);
        }
        List<String>arlist = new ArrayList<>();
        for(Map.Entry<String,Integer>entry:hmap.entrySet()){
            int val = entry.getValue();
            if(val==1) arlist.add(entry.getKey()); 

        }
        String[] ans = new String[arlist.size()];
        for(int i=0;i<arlist.size();i++){
            ans[i] = arlist.get(i);
        }
        return ans;
    }
}