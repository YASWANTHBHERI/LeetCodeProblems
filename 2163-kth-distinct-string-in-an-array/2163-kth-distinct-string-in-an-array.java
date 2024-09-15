class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String,Integer>hmap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hmap.containsKey(arr[i])){
                hmap.put(arr[i],hmap.get(arr[i])+1);
            }
            else {
                hmap.put(arr[i],1);
            }
        }
        int index = 0;
        for(int i=0;i<arr.length;i++){
            int val = hmap.get(arr[i]);
            if(val==1) index++;
            if(index == k) return arr[i];
        }
        return "";
    }
}