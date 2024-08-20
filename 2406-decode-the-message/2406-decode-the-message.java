class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character>hmap = new HashMap<>();
        char [] alps = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int count = 0;
        for(int i=0;i<key.length();i++){
            char ch = key.charAt(i);
            if(!hmap.containsKey(ch) && ch!=' '){
                hmap.put(ch,alps[count]);
                count++;
            }
        }
        String ans = "";
        for(int i=0;i<message.length();i++){
            char ch = message.charAt(i);
            if(ch==' '){
               ans+=' ';
               continue; 
            }
            ans+=hmap.get(ch);
        }
        return ans;
    }
}