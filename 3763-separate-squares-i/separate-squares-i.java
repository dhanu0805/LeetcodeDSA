class Solution {
    public double separateSquares(int[][] squares) {
         double total = 0;
        double low = Double.MAX_VALUE;
        double high = Double.MIN_VALUE;

        for (int[] sq : squares) {
            int y = sq[1];
            int l = sq[2];
            total += 1.0 * l * l;
            low = Math.min(low, y);
            high = Math.max(high, y + l);
        }

        double half = total / 2.0;

        for (int iter = 0; iter < 80; iter++) {
            double mid = (low + high) / 2.0;
            double below = areaBelow(squares, mid);

            if (below < half) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return high; 
    }

    private double areaBelow(int[][] squares, double k) {
        double sum = 0;

        for (int[] sq : squares) {
            int y = sq[1];
            int l = sq[2];

            if (k <= y) {
                continue;
            } else if (k >= y + l) {
                sum += 1.0 * l * l;
            } else {

                sum += (k - y) * l;
            }
        }

        return sum;
    }
}