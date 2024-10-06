class Solution {
    public int compareVersion(String version1, String version2) {

       String v1[] = version1.split("\\.");
       String v2[] = version2.split("\\.");

       int v1Len = v1.length;
       int v2Len = v2.length;

       int i = 0;
       int j = 0;


       while(i<v1Len || i<v2Len){
            int num1 = (i<v1Len)?Integer.parseInt(v1[i]):0;
            int num2 = (j<v2Len)?Integer.parseInt(v2[j]):0;
            if(num1<num2){
                return -1;
            }else if(num1>num2) return 1;
            
            i++;
            j++;
       }
       return 0;
        

        
              

    }
}