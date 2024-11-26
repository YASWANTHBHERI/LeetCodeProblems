class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>arrlist = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>newList = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    newList.add(1);
                }
                else{
                    if(i>1){
                        int a = arrlist.get(i-1).get(j-1);
                        int b = arrlist.get(i-1).get(j);
                        newList.add(a+b);
                    }
                }
            }
            arrlist.add(i,newList);
        }
        return arrlist;

    }
}