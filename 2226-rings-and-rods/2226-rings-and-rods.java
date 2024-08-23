class Solution {
    public int countPoints(String rings) {
        Map<Integer,Set<Character>>hmap = new HashMap<>();
        int count = 0;
        for(int i=0;i<rings.length()-1;i+=2){
            char color = rings.charAt(i);
            int index = Character.getNumericValue(rings.charAt(i+1));
            if(hmap.containsKey(index)){
                Set<Character>res = hmap.get(index);
                res.add(color);
                hmap.put(index,res);
            }else{
                Set<Character> res = new HashSet<>();
                res.add(color);
                hmap.put(index,res);
            }
        }

        for(Set<Character>ans:hmap.values()){
            if(ans.size()==3)count++;
        }

        return count;
    }
}