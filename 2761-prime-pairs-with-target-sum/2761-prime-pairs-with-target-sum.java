class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean[] prime = new boolean[n+1];
        java.util.Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        
        List<Integer> primes = new java.util.ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (prime[i]) primes.add(i);
        }
        
        List<List<Integer>> ans = new java.util.ArrayList<>();
        int left = 0, right = primes.size()-1;
        while (right >= left) {
            int sum = primes.get(left) + primes.get(right);
            if (sum == n) {
                ans.add(java.util.Arrays.asList(primes.get(left), primes.get(right)));
                left++;
            } else if (sum > n) {
                right--;
            } else {
                left++;
            }
        }
        return ans;
    }
}