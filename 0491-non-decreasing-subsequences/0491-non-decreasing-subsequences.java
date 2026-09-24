class Solution {
    public void solve(int[] arr, int idx, List<Integer> curr, List<List<Integer>> ans){
        if(curr.size()>=2){
            ans.add(new ArrayList<>(curr));
        }
        if(idx==arr.length){
            return;
        }
        Set<Integer> set= new HashSet<>();
        for(int i=idx; i<arr.length; i++){
            if(set.contains(arr[i])){
                continue;
            }
            if(curr.isEmpty() || arr[i]>=curr.get(curr.size()-1)){
                set.add(arr[i]);
                curr.add(arr[i]);
                solve(arr, i+1, curr, ans);
                curr.remove(curr.size()-1);
            }
        }
    }
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        solve(nums, 0, new ArrayList<>(), ans);
        return ans;
    }
}