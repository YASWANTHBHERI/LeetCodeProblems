class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer>hset = new HashSet<>();
        for(int i=0;i<candyType.length;i++){
            hset.add(candyType[i]);
        }
        return Math.min(candyType.length/2,hset.size());
    }
}