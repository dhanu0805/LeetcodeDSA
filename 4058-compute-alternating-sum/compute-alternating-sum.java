class Solution {
    public int alternatingSum(int[] nums) {
        int i=0;
        int sum=0;
        for(int num:nums){
            if(i%2==0) sum+=num;
            else sum-=num;
            i++;
        }
        return sum;
    }
}