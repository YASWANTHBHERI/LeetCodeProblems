class Solution {
    public int smallestNumber(int n) {
        
        for(int i=n;i<2*n;i++){
            StringBuilder ans = new StringBuilder();
            int val = i;
            while(val>0){
            int quotient = val/2;
            int rem = val%2; 
            ans.append(rem);
            val = quotient;
        }
            if(ans.indexOf("0") == -1) return i;
        }    
        return -1;
    }
}