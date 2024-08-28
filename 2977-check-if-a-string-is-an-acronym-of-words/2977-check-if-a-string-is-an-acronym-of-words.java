class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.size();i++){
            char ch = words.get(i).charAt(0);
            sb.append(ch);
        }
        return sb.toString().equals(s);
    }
}