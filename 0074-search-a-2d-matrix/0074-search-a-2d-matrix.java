class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low=0;
        int high= matrix.length-1;
        while(low<=high){
            int mid= low+(high-low)/2;
            if(target== matrix[mid][0]){
                return true;
            }
            else if(target<matrix[mid][0]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        if(high>=0) return search(matrix[high], target);
        return false;
        
    }

    boolean search(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(target==arr[mid]){
                return true;
            }
            else if(target<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}