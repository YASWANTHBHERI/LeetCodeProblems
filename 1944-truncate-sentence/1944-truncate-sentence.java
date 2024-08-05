class Solution {
    public String truncateSentence(String s, int k) {
        String str[] = s.split(" ");
        s="";
        for(int i=0;i<k;i++){
            s+=str[i]+" ";
        }
        return s.trim();
    }
}