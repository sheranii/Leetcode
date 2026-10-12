class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int dp[]= new int [n];
        Arrays.fill(dp,-1);
        return higher(n-1, dp, nums);
    }
    int higher(int ind, int dp[], int nums[]){
        if(ind==0) return nums[0];
        if(ind<0) return 0;
        if(dp[ind] !=-1){
            return dp[ind];
        }
        int take= nums[ind]+higher(ind-2, dp, nums);
        int nottake= 0+higher(ind-1, dp, nums);
        dp[ind]= Math.max(take, nottake);
        return dp[ind];
    }
}