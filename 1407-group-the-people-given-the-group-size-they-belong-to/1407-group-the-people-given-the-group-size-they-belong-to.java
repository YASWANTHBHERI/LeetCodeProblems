class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        Map<Integer,List<Integer>>hmap = new HashMap<>();
        List<List<Integer>>result = new ArrayList<>();
        for(int i=0;i<groupSizes.length;i++){
            int size = groupSizes[i];
            List<Integer>tempList = hmap.getOrDefault(size,new ArrayList<>());
            tempList.add(i);
            hmap.put(size,tempList);
            if(tempList.size()==size){
                result.add(tempList);
                hmap.remove(size);
            }
        }
        return result;
    }
}