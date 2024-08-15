class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character,Character>hmap = new HashMap<>();
        Map<Character,Character>hmap2 = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hmap.put(s.charAt(i),t.charAt(i));
            hmap2.put(t.charAt(i),s.charAt(i));
        }
        String str = "";
        String str2 = "";
        for(int i=0;i<s.length();i++){
            str+=hmap.get(s.charAt(i));
            str2+=hmap2.get(t.charAt(i));
        }
        if(str.equals(t) && str2.equals(s)) return true;
        return false;
    }
}