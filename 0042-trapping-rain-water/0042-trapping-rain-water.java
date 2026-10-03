class Solution {
    public int trap(int[] height) {
        int n=height.length;
        // int water=0;
        // for(int i=0;i<n;i++){
        //     int leftMax=0;
        //     for(int j=i;j>=0;j--){
        //         leftMax=Math.max(leftMax,height[j]);
        //     }
        //     int rightMax=0;
        //     for(int j=i;j<n;j++){
        //         rightMax=Math.max(rightMax,height[j]);
        //     }
        //     water+=Math.min(leftMax,rightMax)-height[i];
        // }
        // return water;

        // int[] leftmax= new int[n];
        // leftmax[0]=height[0];
        // for(int i=1; i<height.length; i++){
        //     leftmax[i]=Math.max(leftmax[i-1], height[i]);
        // }
        // int[] rightmax= new int[n];
        // rightmax[n-1]= height[n-1];
        // for(int j=n-2; j>=0; j--){
        //     rightmax[j]= Math.max(rightmax[j+1], height[j]);
        // }
        // int water= 0;
        // for(int k=0; k<n; k++){
        //     water+=Math.min(leftmax[k], rightmax[k])-height[k];
        // }
        // return water;

        int l=0;
        int r=height.length-1;
        int leftmax=0;
        int rightmax=0;
        int water=0;
        while(l<r){
            leftmax=Math.max(leftmax, height[l]);
            rightmax=Math.max(rightmax, height[r]);
            if(leftmax<rightmax){
                water+=leftmax-height[l];
                l++;
            }
            else{
                water+=rightmax-height[r];
                r--;
            }

        }
        return water;

    }
}