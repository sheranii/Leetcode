class Solution {
    public void solve(int idx, int[] nums, List<Integer> curr, List<List<Integer>> ans){
        if(idx==nums.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[idx]);
        solve(idx+1, nums, curr, ans);
        curr.remove(curr.size()-1);

        int newidx= idx+1;
        while(newidx< nums.length && nums[idx]== nums[newidx]){
            newidx++;
        }
        solve(newidx, nums, curr, ans);
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        solve(0, nums, curr, ans);
        return ans;
        
    }
}