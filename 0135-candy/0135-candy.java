class Solution {
    public int candy(int[] ratings) {
        int min_candie = 0;
        int ls[] = new int[ratings.length];
        int rs[] = new int[ratings.length];
        Arrays.fill(ls,1);
        Arrays.fill(rs,1);
        for(int i=1;i<ratings.length;i++){
            if(ratings[i]>ratings[i-1]) ls[i] = ls[i-1]+1;
        }
        for(int i=ratings.length-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])rs[i] = rs[i+1]+1;
        }
        int min_candies = 0;
        for(int i=0;i<ratings.length;i++){
            min_candies+= Math.max(ls[i],rs[i]);
        }
        return min_candies;
    }
}