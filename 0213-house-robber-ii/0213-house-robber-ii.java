class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 1) return nums[0];

        int case1 = robRange(nums, 0, n - 2);
        int case2 = robRange(nums, 1, n - 1);

        return Math.max(case1, case2);
    }

    private int robRange(int[] nums, int start, int end) {
        int len = end - start + 1;
        int[] dp = new int[len];

        dp[0] = nums[start];

        if (len == 1) return dp[0];

        dp[1] = Math.max(nums[start], nums[start + 1]);

        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(
                dp[i - 1],
                nums[start + i] + dp[i - 2]
            );
        }

        return dp[len - 1];
    }
}
