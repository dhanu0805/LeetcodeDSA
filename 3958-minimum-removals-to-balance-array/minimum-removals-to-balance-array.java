class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int res=0,left=0,right=0;
        while(left<nums.length && right<nums.length ){
            if((long)nums[right]<=(long)nums[left]*k){
                  res=Math.max(res,right-left+1);
                right++;
            }else{
                left++;
            }
        }
        return nums.length-res;
    }
}