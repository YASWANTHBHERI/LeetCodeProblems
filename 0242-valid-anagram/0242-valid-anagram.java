class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        Map<Character,Integer>hmap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            if(hmap.containsKey(s.charAt(i))){
                int val = hmap.get(s.charAt(i));
                hmap.put(s.charAt(i),val+1);
            }else hmap.put(s.charAt(i),1);
        }
        for(int i=0;i<s.length();i++){
            if(hmap.containsKey(t.charAt(i))){
                hmap.put(t.charAt(i),hmap.get(t.charAt(i))-1);
            }else hmap.put(t.charAt(i),1);
        }
        for(int i=0;i<t.length();i++){
             if(hmap.get(t.charAt(i))>0)return false;
             if(hmap.get(s.charAt(i))>0)return false;
        }
        
        return true;
    }
}