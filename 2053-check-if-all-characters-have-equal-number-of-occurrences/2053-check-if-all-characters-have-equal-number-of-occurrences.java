class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character,Integer>hmap = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!hmap.containsKey(ch)) hmap.put(ch,1);
            else hmap.put(ch,hmap.get(ch)+1);
        }
        int previousVal = hmap.get(s.charAt(0));
        for(int i=1;i<s.length();i++){
            int val = hmap.get(s.charAt(i));
            if(val!=previousVal) return false;
        }
        return true;
    }
}