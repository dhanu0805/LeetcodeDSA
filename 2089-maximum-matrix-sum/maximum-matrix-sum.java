class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        long sum=0;
        int c=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int val=matrix[i][j];
                if(val<0) c++;
                sum=sum+Math.abs(val);
                min=Math.min(min,Math.abs(val));
            }
        }
        if(c%2==0) return sum;
        return sum-2*min;
    }
}