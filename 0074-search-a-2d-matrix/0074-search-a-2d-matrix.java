class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length , cols = matrix[0].length;
        int low = 0 , high = rows*cols -1;
        while(low<=high){
            int mid  = low + (high -low)/2;
            int midrow = mid / cols , midcol = mid % cols;
            if (matrix[midrow][midcol] == target)return true;
            else if (matrix [ midrow][midcol] > target) high = mid-1;
            else low = mid +1;

        }
        return false ;
    }
}