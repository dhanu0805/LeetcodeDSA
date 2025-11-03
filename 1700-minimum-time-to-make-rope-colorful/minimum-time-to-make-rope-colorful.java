class Solution {
    public int minCost(String s, int[] neededTime) {
        int cost=0;
        int res=0;
        int max=0;
        for(int i=0;i<s.length();i++){
            if(i>0 && s.charAt(i)!=s.charAt(i-1)){
                cost-=max;
                res+=cost;
                cost=max=0;
            }
            cost +=neededTime[i];
            max=Math.max(max,neededTime[i]);

        }
        res=res+(cost-max);
        return res;

    }
}