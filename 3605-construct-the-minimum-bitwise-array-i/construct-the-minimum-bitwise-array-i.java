class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
           int n = nums.size();
        int[] ans = new int[n];

        for(int i = 0; i < n; i++){
            int p = nums.get(i);
            int res = -1;

            for(int a = 0; a < p; a++){
                if( (a | (a + 1)) == p ){
                    res = a;
                    break; 
                }
            }

            ans[i] = res;
        }
        return ans;
    }
}