class Solution {
    public int minOperations(int[] nums, int k){
        int xor=0;
        for(int num:nums){
            xor=xor^num;
        }
        int res=0;
        for(int i=0;i<32;i++){
            int xbit=((xor>>i) & 1);
            int kbit=((k>>i) & 1);
            if(kbit !=xbit) res++;
        }
        return res;
    }
}