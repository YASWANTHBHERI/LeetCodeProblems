class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character>hset = new HashSet<>();
        if(s==null) return 0;
        if(s.length()==1) return 1;
        for(int i=0;i<s.length();i++){
            if(!hset.contains(s.charAt(i))){
                hset.add(s.charAt(i));
            }else{
                hset.remove(s.charAt(i));
            }
        }
        int freq = hset.size();
        return s.length()-(freq==0?0:freq-1);
    }

}