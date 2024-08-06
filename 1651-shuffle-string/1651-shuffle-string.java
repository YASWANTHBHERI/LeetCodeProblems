class Solution {
    public String restoreString(String s, int[] indices) {
        Map<Integer,Character>hmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hmap.put(indices[i],s.charAt(i));
        }
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(hmap.containsKey(i)){
                ans+=hmap.get(i);
            }
        }
        return ans;
    }
}