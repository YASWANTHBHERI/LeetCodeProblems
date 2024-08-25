class Solution {
    public int balancedStringSplit(String s) {
        int lcount = 0;
        int rcount = 0;
        int res = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R')rcount++;
            else lcount++;
            if(rcount==lcount)res++;
        } 
        return res;
    }
}