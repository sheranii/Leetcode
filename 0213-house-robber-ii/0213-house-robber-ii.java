class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int case1 = solve(n - 2, 0, nums, dp1);

        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int case2 = solve(n - 1, 1, nums, dp2);

        return Math.max(case1, case2);
    }

    private int solve(int i, int start, int[] nums, int[] dp) {
        if (i < start) return 0;

        if (dp[i] != -1) return dp[i];

        int skip = solve(i - 1, start, nums, dp);
        int take = nums[i] + solve(i - 2, start, nums, dp);

        return dp[i] = Math.max(take, skip);
    }
}
