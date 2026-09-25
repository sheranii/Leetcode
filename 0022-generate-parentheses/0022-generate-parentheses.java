class Solution {
    public void solve(int n, int open, int close, String curr, List<String> ans){
        if(curr.length() == n*2){
            ans.add(curr);
            return;
        }
        if(open<n){
            solve(n, open+1, close, curr+"(", ans);
        }
        if(close<open){
            solve(n, open, close+1, curr+")", ans);
        }

    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        String curr="";
        solve(n, 0, 0, curr, ans);
        return ans;
    }
}