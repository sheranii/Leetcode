 class Solution{
 private void combination(List<List<Integer>> ans, List<Integer> comb, int k,  int start, int n) {

	if (comb.size() == k && n == 0) {
		ans.add(new ArrayList<>(comb));
		return;
	}
    // /hmko array nhi de rkhi hai jo test case de rkhe h usse we have to find it 
    if (comb.size() > k || n < 0) {
        return;
    }

	for (int i = start; i <= 9; i++) {
		comb.add(i);
		combination(ans, comb, k, i+1, n-i);
		comb.remove(comb.size() - 1);
	}
}
 
 
 public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> ans = new ArrayList<>();

    combination(ans, new ArrayList<Integer>(), k, 1, n);
    return ans;
}
}
