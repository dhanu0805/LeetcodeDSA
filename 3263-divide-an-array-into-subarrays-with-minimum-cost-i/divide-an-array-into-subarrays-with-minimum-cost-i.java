class Solution {
    public int minimumCost(int[] nums) {
        int sum=nums[0];
      int  small1=Integer.MAX_VALUE;
      int  small2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<small1){
                small2=small1;
                small1=nums[i];
            }
            else if(nums[i]<small2)small2=nums[i];
        }
        return sum+small1+small2;
        
    }
}