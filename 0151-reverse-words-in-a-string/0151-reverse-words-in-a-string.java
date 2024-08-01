class Solution {
    public String reverseWords(String s) {
        String arr[] = s.split(" +");
        s="";
        for(int i=arr.length-1;i>=0;i--){
            s+=arr[i]+" ";
        }
        return s.trim();
        
    }
}