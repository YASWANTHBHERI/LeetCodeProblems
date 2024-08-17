class Solution {
    public String sortSentence(String s) {
        Map<Integer,String>hmap = new HashMap<>();
        String str = "";
        int len = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!Character.isDigit(ch))str+=ch;
            if(Character.isDigit(ch)){
                hmap.put(Character.getNumericValue(ch)-1,str);
                str = "";
                len++;
            }
        }
        String ans = "";
        for(int i=0;i<len;i++){
            ans+=hmap.get(i).trim();
            if(i!=len) ans+=" ";
        }
        return ans.trim();
    }
}