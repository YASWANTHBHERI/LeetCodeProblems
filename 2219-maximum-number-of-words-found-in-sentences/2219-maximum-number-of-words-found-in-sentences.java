class Solution {
    public int mostWordsFound(String[] sentences) {
        int max_words = 0;
        for(int i=0;i<sentences.length;i++){
            String arr[] = sentences[i].split(" ");
            if(arr.length>max_words) max_words = arr.length;
        }
        return max_words;
    }
}