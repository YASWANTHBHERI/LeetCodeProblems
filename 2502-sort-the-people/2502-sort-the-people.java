class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String [] ans = new String[names.length];
        Map<Integer,String>hmap = new HashMap<>();
        for(int i=0;i<names.length;i++){
            hmap.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int len = names.length-1;
        for(int i=names.length-1;i>=0;i--){
            ans[len-i]=hmap.get(heights[i]);
        }
        return ans;
    }
}