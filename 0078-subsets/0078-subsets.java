class Solution {
    public void solve(int index, int[] nums, List<Integer> curr, List<List<Integer>> list){
        if(index==nums.length){
            list.add(new ArrayList<>(curr));
            return;
        }
        curr.add(nums[index]);
        solve(index+1, nums, curr, list);
        curr.remove(curr.size()-1);
        solve(index+1, nums, curr, list);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        solve(0, nums, new ArrayList<>(),ans );
        return ans;

    }
}