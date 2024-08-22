class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<words.length;i++){
            StringBuilder word = new StringBuilder(words[i]);
            word.reverse();
            sb.append(word+" ");
        }
        return sb.toString().trim();
    }
}