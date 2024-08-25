class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(int i=0;i<items.size();i++){
            switch(ruleKey){
                case "type":
                    if(ruleValue.equals(items.get(i).get(0)))count++;
                    break;
                case "color":
                    if(ruleValue.equals(items.get(i).get(1)))count++;
                    break;
                case "name":
                    if(ruleValue.equals(items.get(i).get(2)))count++;
                    break;
                default:
                    break;
            }
        }
        return count;
    }
}