class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Map<Character,Integer>hmap = new HashMap<>();
        int count  = 0;
        for(int i=0;i<allowed.length();i++){
            hmap.put(allowed.charAt(i),1);
        }
        for(int i=0;i<words.length;i++){
            int check = 0;
            String str = words[i];
            while(check<str.length()){
                char ch = str.charAt(check);
                if(!hmap.containsKey(ch)){
                    count++;
                    break;
                }
                check++;
            }
        }
        return Math.abs(words.length-count);
    }
}