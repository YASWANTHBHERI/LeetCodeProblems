class Solution {
    public String[] findWords(String[] words) {
        StringBuilder row1 = new StringBuilder("qwertyuiop");
        StringBuilder row2 = new StringBuilder("asdfghjkl");
        StringBuilder row3 = new StringBuilder("zxcvbnm");

        List<String> ans = new ArrayList<>();

        Map<Character,Integer>map = new HashMap<>();
        for(int i=0;i<row1.length();i++){
            map.put(row1.charAt(i),1);
        }
        for(int i=0;i<row2.length();i++){
            map.put(row2.charAt(i),2);
        }
        for(int i=0;i<row3.length();i++){
            map.put(row3.charAt(i),3);
        }

        for(int i=0;i<words.length;i++){
            int row_1 = 0;
            int row_2 = 0;
            int row_3 = 0;

            for(int j=0;j<words[i].length();j++){
                char ch = Character.toLowerCase(words[i].charAt(j));
                if(map.containsKey(ch)){
                    int val = map.get(ch);
                    if(val == 1){
                        row_1++;
                        row_2 = 0;
                        row_3 = 0;
                    }else if(val == 2){
                        row_1 = 0;
                        row_2++;
                        row_3 = 0; 
                    }else if(val==3){
                        row_1=0;
                        row_2=0;
                        row_3++;
                    }
                }
            }
            if(row_1==words[i].length()) ans.add(words[i]);
            else if(row_2==words[i].length()) ans.add(words[i]);
            else if(row_3==words[i].length()) ans.add(words[i]);
        }

        String[] res = new String[ans.size()];
        int idx = 0;
        for(String w:ans){
            res[idx] = w;
            idx++;
        }
        return res;
    }
    
}