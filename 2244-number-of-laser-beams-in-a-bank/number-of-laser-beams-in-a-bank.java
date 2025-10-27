class Solution {
    public int numberOfBeams(String[] bank) {
        int prev=0;
        int res=0;
        for(String s:bank){
            int curr=0;
            for(char ch:s.toCharArray()){
   if(ch=='1') curr++;
            }
            if(curr>0){
                res+=prev*curr;
                prev=curr;
            }
        }
        return res;
    }
}