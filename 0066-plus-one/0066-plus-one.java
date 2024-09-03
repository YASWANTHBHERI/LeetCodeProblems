class Solution {
    public int[] plusOne(int[] digits) {
       if(digits[digits.length-1]!=9){
            digits[digits.length-1]+=1;
            return digits;
       }
       List<Integer>arlist = new ArrayList<>();
       int carry = 0;
       if(digits[digits.length-1]==9) carry = 1;
       for(int i=digits.length-1;i>=0;i--){
            if(digits[i]+1>9 && carry>0){
                carry = 1;
                arlist.add(0);
            }
            else{
                arlist.add(digits[i]+carry);
                carry = 0;
            }
       }
       if(carry == 1) arlist.add(1); 
       


       int ans[] = new int[arlist.size()];
       for(int i=0;i<arlist.size();i++){
            ans[arlist.size()-i-1] = arlist.get(i);
       }
       return ans;
    }
}