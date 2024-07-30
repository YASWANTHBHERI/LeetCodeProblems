class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>hmap = new HashMap<>();
        int res = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!hmap.containsKey(ch)){
                if(ch == 'I') hmap.put(ch,1);
                else if(ch=='V')hmap.put(ch,5);
                else if(ch=='X')hmap.put(ch,10);
                else if(ch=='L')hmap.put(ch,50);
                else if(ch=='C')hmap.put(ch,100);
                else if(ch=='D')hmap.put(ch,500);
                else if(ch=='M')hmap.put(ch,1000);
            }
        }

        for(int i=s.length()-1;i>0;i--){
            int last = hmap.get(s.charAt(i));
            int lastBefore = hmap.get(s.charAt(i-1));
            if(last>lastBefore){
                res+= hmap.get(s.charAt(i))-lastBefore;
                i=i-1;
            }
            else res+=hmap.get(s.charAt(i));
        }
        if(s.length()>1 && hmap.get(s.charAt(0)) < hmap.get(s.charAt(1))) res = res;
        else res += hmap.get(s.charAt(0));  
        return res;
    }
}