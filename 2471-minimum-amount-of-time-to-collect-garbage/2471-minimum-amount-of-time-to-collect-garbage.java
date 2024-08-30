class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int m_truck = 0;
        int p_truck = 0;
        int g_truck = 0;
        int pickup = 0;
        int[] arr = new int[travel.length];
        arr[0] = travel[0];

        for(int i=1;i<travel.length;i++){
            arr[i] = arr[i-1] + travel[i];
        }

        for(int i=0;i<garbage.length;i++){
            String str = garbage[i];
            pickup+=str.length();
            if(str.contains("M")) m_truck = i;
            if(str.contains("P")) p_truck = i;
            if(str.contains("G")) g_truck = i;
        }
        int ans = pickup;
        if(m_truck>0) ans+=arr[m_truck-1];
        if(p_truck>0) ans+=arr[p_truck-1];
        if(g_truck>0) ans+=arr[g_truck-1];
        return ans;
    }
}