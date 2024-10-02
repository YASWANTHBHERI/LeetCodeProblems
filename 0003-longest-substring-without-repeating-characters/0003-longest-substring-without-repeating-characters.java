class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();
        int len = 1;
        int l = 0;
        int r = 0;
        Set<Character>hset = new HashSet<>();
        while(r<s.length()){
            char ch = s.charAt(r);
            if(!hset.contains(ch)){
                hset.add(ch);
               len = Math.max(len,(r-l)+1);
               r++;
            }else{
                hset.remove(s.charAt(l));
                l++;
            }
        }
        return len;
    }
}