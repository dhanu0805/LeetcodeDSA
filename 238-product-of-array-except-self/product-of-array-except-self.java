class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
      int suf[]=new int[n];
      int pre[]=new int[n];
      suf[0]=1;
      for(int i=1;i<n;i++){
suf[i]=nums[i-1]*suf[i-1];
      }
        pre[n-1]=1;
      for(int i=n-2;i>=0;i--){
pre[i]=nums[i+1]*pre[i+1];
      }
      for(int i=0;i<n;i++){
nums[i]=suf[i]*pre[i];
      }
      return nums;
    }
}