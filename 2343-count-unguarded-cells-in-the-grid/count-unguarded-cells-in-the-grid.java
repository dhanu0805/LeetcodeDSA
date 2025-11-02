class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int grid[][]=new int[m][n];
        for(int []arr:guards) grid[arr[0]][arr[1]]=1;
        for(int []arr:walls) grid[arr[0]][arr[1]]=2;
        int dirs[][]={{1,0},{-1,0},{0,1},{0,-1}};
        for(int grids[]:guards){
            int r=grids[0],c=grids[1];
            for(int dir[]:dirs){
                 int x = r + dir[0], y = c + dir[1];

                while (x >= 0 && x < m && y >= 0 && y < n) {
                    if (grid[x][y] == 1 || grid[x][y] == 2) break; 
                    if (grid[x][y] == 0) grid[x][y] = 3;   
                    x += dir[0]; y += dir[1];
                }
            }
        }
         int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) count++;
            }
        }

        return count;
    }
}