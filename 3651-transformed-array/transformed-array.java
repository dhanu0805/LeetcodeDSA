class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int len=nums.length;
        int res[]=new int[len];
        for(int i=0;i<len;i++){
            if(nums[i]==0) res[i]=0;
            else {
                int ind=(i+nums[i])%len;
               if(ind<0) ind=ind+len;
               res[i]=nums[ind];
            }
        }
        return res;
    }
}