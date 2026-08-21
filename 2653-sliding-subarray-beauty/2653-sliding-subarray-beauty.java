class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        int[] freq = new int[101];
        for (int i = 0; i < k; i++) {
            freq[nums[i] + 50]++;
        }

        for (int i = 0; i <= n - k; i++) {
            int count = 0;
            ans[i] = 0;

            for (int num = -50; num < 0; num++) {

                count += freq[num + 50];

                if (count >= x) {
                    ans[i] = num;
                    break;
                }
            }
            if (i < n - k) {
                freq[nums[i] + 50]--;
                freq[nums[i + k] + 50]++;
            }
        }

        return ans;
    }
}