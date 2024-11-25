class Solution {
    public boolean canCross(int[] stones) {
        HashMap<Integer,HashSet<Integer>> hmap = new HashMap<>();
        for(int val: stones){
            hmap.put(val,new HashSet<>());
        }
        hmap.get(stones[0]).add(1);

        for(int val: stones){
            for(int jump: hmap.get(val)){
                if(jump!=0 && hmap.containsKey(val+jump)){
                    hmap.get(val+jump).add(jump-1);
                    hmap.get(val+jump).add(jump);
                    hmap.get(val+jump).add(jump+1);
                }
            }
        }
        
        return !hmap.get(stones[stones.length-1]).isEmpty();
    }
}