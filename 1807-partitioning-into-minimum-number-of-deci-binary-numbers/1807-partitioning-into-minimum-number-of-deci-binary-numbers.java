class Solution {
    public int minPartitions(String n) {
        int max = -1;
        for(int i=0;i<n.length();i++){
            int digit = Character.getNumericValue(n.charAt(i));
            if(digit>max) max = digit;
        }
        return max;
    }
}