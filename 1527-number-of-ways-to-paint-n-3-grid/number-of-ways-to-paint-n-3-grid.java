class Solution {
    public int numOfWays(int n) {
        int mod=1000000007;
        long abc=6;
        long aba=6;
        for(int i=2;i<=n;i++){
            long temp=abc;
            abc=(abc*2+aba*2)%mod;
            aba=(aba*3+temp*2)%mod;
        }
        return (int)(abc+aba)%mod;
    }
}