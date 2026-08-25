class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = 0;
        int extra = 0;
        int start = 0;
        
        for(int i = 0; i < n; i++){
            total += gas[i] - cost[i];
            extra += gas[i] - cost[i];
            if(extra < 0){
                extra = 0;
                start = i + 1;
            }
        }
        return (total < 0) ? -1 : start;
    }
}