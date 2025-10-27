class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int n=grid.length;
        int row[]=new int[grid.length];
        int col[]=new int[grid.length];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                row[i]=Math.max(row[i],grid[i][j]);
            }
        }
          for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                col[i]=Math.max(col[i],grid[j][i]);
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                ans+=Math.min(row[i],col[j])-grid[i][j];
            }
        }
        return ans;
    }
}