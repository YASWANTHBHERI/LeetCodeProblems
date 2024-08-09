class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0;i<words.length;i++){
            String str = findPalindrome(words[i]);
            if(str.equals(words[i])) return str;
        }
        return "";
    }
    public String findPalindrome(String str){
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        return rev;
    }
}