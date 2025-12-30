class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int count=0;
         if(row<3 || col<3) return 0;
         for(int i=0;i<row-2;i++){
            for(int j=0;j<col-2;j++){
                if( magicRows(i,j,grid) && magicCol(i,j,grid) && magicDai(i,j,grid) && distinct(i,j,grid)) count++;
            }
         }
         return count;
    }
    boolean magicRows(int row,int col,int grid[][]){
        for(int i=row;i<row+3;i++){
            int sum=0;
            for(int j=col;j<col+3;j++){
  sum=sum+grid[i][j];
            }
            if(sum!=15) return false;
        }
        return true;
    }
      boolean magicCol(int row,int col,int grid[][]){
        for(int i=col;i<col+3;i++){
            int sum=0;
            for(int j=row;j<row+3;j++){
  sum=sum+grid[j][i];
            }
            if(sum!=15) return false;
        }
        return true;
    }
      boolean magicDai(int row,int col,int grid[][]){
       int _1stSum=grid[row][col]+grid[row+1][col+1]+grid[row+2][col+2];
        int _2ndSum=grid[row][col+2]+grid[row+1][col+1]+grid[row+2][col];
        return _1stSum==15 && _2ndSum==15;
    }
    boolean distinct(int row,int col,int grid[][]){
         boolean dis[]=new boolean[10];
        for(int i=row;i<row+3;i++){
            for(int j=col;j<col+3;j++){
                 int num=grid[i][j];
                  if(num<1 || num>9) return false;
                 if(dis[num]) return false;
                 dis[num]=true;
            }
        }
        for(int i=1;i<=9;i++){
            if(!dis[i])return false;
        }
        return true;
    }
}