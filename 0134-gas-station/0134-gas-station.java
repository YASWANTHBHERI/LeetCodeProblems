class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start_indx = 0;
        int sum = 0;
        int total_fuel = 0;
        int total_cost = 0;
        for(int i=0;i<gas.length;i++){
            total_fuel += gas[i];
            total_cost += cost[i];
        }
        if(total_cost>total_fuel) return -1;
        for(int i=0;i<gas.length-1;i++){
            total_fuel += gas[i];
            total_cost += cost[i];
            
            sum += gas[i]-cost[i];
            if(sum<0){
                sum = 0;
                start_indx = i+1;
            }
        }
        return start_indx;
    }
}