class Solution {
    public String reversePrefix(String word, char ch) {
        if(word.charAt(0)==ch) return word;
        String str1 = "";
        String str2 = "";
        String rev = "";
        for(int i=0;i<word.length();i++){
            if(ch==(word.charAt(i))){
                str1+= word.substring(0,i+1);
                str2+=word.substring(i+1);
                break;
            }
        }
        for(int i=str1.length()-1;i>=0;i--){
            rev+=str1.charAt(i);
        }
        String ans = rev+str2;
        if(ans.equals("")) ans = word;
        return ans;
    }
}