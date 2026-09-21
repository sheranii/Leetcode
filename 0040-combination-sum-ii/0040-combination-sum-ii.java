class Solution {
    public void solve(int i, int sum, int target, int[] arr, List<Integer> curr, List<List<Integer>> ans){
        if(i==arr.length){
            if(sum==target){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        if(sum+arr[i]<=target){
            curr.add(arr[i]);
            solve(i+1, arr[i]+sum, target,arr, curr, ans);
            curr.remove(curr.size()-1);
        }
        int newidx= i+1;
        while(newidx< arr.length && arr[i]== arr[newidx]){
            newidx++;
        }
        solve(newidx, sum, target, arr, curr, ans);
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        solve(0,0,target, candidates, curr, ans);
        return ans;
    }
}