class Solution {
    public boolean isPalindrome(int x) {
        int val = x;
        int reverseNum = 0;
        if(x<0) return false;
        while(val>0){
            int digit = val%10;
            reverseNum = (reverseNum*10)+digit;
            val/=10;
        }
        if(reverseNum == x) return true;
        return false;
    }
}