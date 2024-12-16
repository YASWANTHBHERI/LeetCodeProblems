class Solution {
    public int reverse(int x) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        if(x>max || x<min) return 0;
        int value = Math.abs(x);
        StringBuilder sb  = new StringBuilder(String.valueOf(x));
        sb.reverse();
        if(x<0){
            sb.delete(sb.length()-1,sb.length());
            sb.insert(0,"-");
        }
        long val = Long.parseLong(String.valueOf(sb));
        if(val>max || val<min) return 0;
        return Integer.parseInt(String.valueOf(sb));
        
    }
}