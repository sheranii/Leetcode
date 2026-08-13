class Solution {
    public int maximalRectangle(char[][] matrix) {
        int maxarea=0;
        int[] height= new int[matrix[0].length];
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]=='1'){
                    height[j]++;
                }
                else{
                    height[j]=0;
                }
            }
            maxarea= Math.max(maxarea, solve(height));
        }
        return maxarea;
    }

        public int solve(int[] height){
            int n= height.length;
            int[] left= new int[n];
            int[] right= new int[n];
            Stack<Integer> st= new Stack<Integer> ();
            //smaller
            for(int i=0; i<n; i++){
                while(!st.isEmpty() && height[st.peek()] >= height[i] ) st.pop();
                left[i]= st.isEmpty() ? -1: st.peek();
                st.push(i);

            }
            st.clear();
            //larger
            for(int i=n-1; i>=0; i--){
                while(!st.isEmpty() && height[st.peek()] >= height[i]) st.pop();
                right[i]= st.isEmpty() ? n: st.peek();
                st.push(i);
            }
            int maxarea=0;
            for(int i=0; i<height.length; i++){
                int w= right[i]-left[i]-1;
                maxarea= Math.max(maxarea, height[i] * w);

            }
            return maxarea;
        }
    }
