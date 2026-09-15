class Solution {
    public int maxProfit(int[] prices) {
          int n= prices.length;
          int i=0;
          int j=1;
          int p=0;
          int maxp=0;
          while(i<n-1 && j<n){
            p= prices[j]- prices[i];
            if(p>0){
            maxp+=p;
            }
            p=0;
            i++;
            j++;
          }
          return maxp;
    }
}