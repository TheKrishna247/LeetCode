class Solution {
    public boolean isToeplitzMatrix(int[][] grid) {
        int row = grid.length , col = grid[0].length;
        boolean flag = true;
        for(int i=0;i<row-1;i++){
            for(int j =0;j<col-1;j++){
                if(grid[i][j] !=grid[i+1][j+1]) flag = false;
            }
        }
        return flag;

    }
}