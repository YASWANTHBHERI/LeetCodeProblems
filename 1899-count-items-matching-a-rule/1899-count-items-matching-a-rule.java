class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i=0;i<1;i++){
            for(int j=0;j<items.size();j++){
                String type = items.get(j).get(0);
                String color = items.get(j).get(1);
                String name = items.get(j).get(2);
                
                if(ruleKey.equals("type")){
                    if(ruleValue.equals(type))count++;
                }else if(ruleKey.equals("color")){
                    if(ruleValue.equals(color))count++;
                }else if(ruleKey.equals("name")){
                    if(ruleValue.equals(name))count++;
                }
            }
        }
        return count;
    }
}