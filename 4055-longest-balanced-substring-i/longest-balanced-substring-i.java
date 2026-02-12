class Solution {
    public int longestBalanced(String s) {
         int n = s.length();
        int max = 1;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];

            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                int count = 0;
                boolean balanced = true;

                for (int f : freq) {
                    if (f > 0) {
                        if (count == 0) count = f;
                        else if (f != count) {
                            balanced = false;
                            break;
                        }
                    }
                }

                if (balanced) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }
        return max;
    }
}