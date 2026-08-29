class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        int[] prime= new int[n+1];
        List<List<Integer>> ans = new ArrayList<>();
        if (n < 4) return ans;

        Arrays.fill(prime,1);
        prime[0]=0;
        prime[1]=1;
        for(int i=2; i*i<=n; i++){
            if(prime[i]==1){
                for(int j=i*i; j<=n; j+=i){
                    prime[j]=0;
                }
            }
        }
         for (int i = 2; i <= n / 2; i++) {
            if (prime[i]==1 && prime[n - i]==1) {
                ans.add(Arrays.asList(i, n - i));
            }
         }
        return ans;
    }
}