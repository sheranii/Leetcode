class Solution {
    public void rotate(int[] nums, int k) {
        int n= nums.length;
        k=k%n;
        solve(nums, 0, n-1);
        solve(nums, 0, k-1);
        solve(nums, k, n-1);
        
    }
    public void solve(int[]nums, int l, int r){
        
        while(l<r){
            int temp= nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
}