class Solution {
    public void solve(int[] arr, int i, int sum ,List<Integer> curr, List<List<Integer>> ans, int target) {
        
        if (i == arr.length) {
            if (sum == target) {
                ans.add(new ArrayList<>(curr));
            }
            return;
        }
        if (sum + arr[i] <= target) {
            curr.add(arr[i]);
            solve(arr, i,arr[i] + sum,curr, ans, target);
            curr.remove(curr.size() - 1);
        }
        solve(arr, i + 1,sum, curr, ans, target);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        solve(candidates, 0, 0,curr, ans, target);
        return ans;
    }
}