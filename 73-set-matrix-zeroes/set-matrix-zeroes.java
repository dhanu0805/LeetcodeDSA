class Solution {
    public void setZeroes(int[][] matrix) {
          int m = matrix.length;
        int n = matrix[0].length;

        boolean row0 = false, col0 = false;

        // check first column
        for (int i = 0; i < m; i++) {
            if (matrix[i][0] == 0) col0 = true;
        }

        // check first row
        for (int j = 0; j < n; j++) {
            if (matrix[0][j] == 0) row0 = true;
        }

        // mark zeros
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // use markers to set zeros
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // first column
        if (col0) {
            for (int i = 0; i < m; i++) matrix[i][0] = 0;
        }

        // first row
        if (row0) {
            for (int j = 0; j < n; j++) matrix[0][j] = 0;
        }
    }
}