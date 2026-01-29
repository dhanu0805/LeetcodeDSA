class Solution {
    public int minOperations(int[] nums, int k) {
        int sum=0,res=0;
        for(int num:nums) sum=sum+num;
res=sum%k;
return res;
    }
}