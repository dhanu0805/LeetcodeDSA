class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
         int n = garbage.length;
        int total = 0;

        int lastM = -1, lastP = -1, lastG = -1;

        for (int i = 0; i < n; i++) {
            total += garbage[i].length();
            for (char c : garbage[i].toCharArray()) {
                if (c == 'M') lastM = i;
                else if (c == 'P') lastP = i;
                else if (c == 'G') lastG = i;
            }
        }

        for (int i = 0; i < n - 1; i++) {
            if (i < lastM) total += travel[i];
            if (i < lastP) total += travel[i];
            if (i < lastG) total += travel[i];
        }

        return total;
    }
}