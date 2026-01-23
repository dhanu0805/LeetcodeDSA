class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int res[][]=new int[row][col];
        int rowCount[]=new int[row];
        int colCount[]=new int[col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 if(grid[i][j]==1){
                    rowCount[i]++;
                    colCount[j]++;
                 }
            }

        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 res[i][j]=rowCount[i]+colCount[j]-(col-rowCount[i])-(row-colCount[j]);
                 }
            }
            return res;
    }
}