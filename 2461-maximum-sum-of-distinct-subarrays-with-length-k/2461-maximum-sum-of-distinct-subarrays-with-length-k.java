class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long sum = 0;
        long ans = 0;
        int i = 0;

        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];

            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            if (j - i + 1 > k) {
                map.put(nums[i], map.get(nums[i])-1);

                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }

                sum -= nums[i];
                i++;
            }

            if (j - i + 1 == k) {

                if (map.size() == k) {
                    ans = Math.max(ans, sum);
                }
            }
        }

        return ans;
    }
}