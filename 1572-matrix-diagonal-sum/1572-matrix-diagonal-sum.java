class Solution {
    public int diagonalSum(int[][] arr) {
        int sum = 0;
        int row = arr.length , col = arr[0].length;
        for(int i =0 ;i<row;i++){
            for(int j = 0;j<col;j++){
                if(i == j || i+j == col-1) sum+= arr[i][j];
            }
        }
        return sum;
        
    }
}