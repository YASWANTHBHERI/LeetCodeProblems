class Solution {
    public int findPermutationDifference(String s, String t) {
        Map<Character,Integer>hmap = new HashMap<>();
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(hmap.containsKey(ch1)){
                int val = hmap.get(ch1);
                sum += Math.abs(i-val);
            }else hmap.put(ch1,i);
            if(hmap.containsKey(ch2)){
                int val = hmap.get(ch2);
                sum+=Math.abs(i-val);
            }else hmap.put(ch2,i);
        }
        return sum;
    }
}