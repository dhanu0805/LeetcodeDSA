class Solution {
    public int distMoney(int money, int children) {
        if(money<children) return -1;
         if(money>8*children) return children-1;
        money=money-children;
        int full=money/7;
        int rem=money%7;
        if(rem==3 && full==children-1) return full-1;
        return full;
    }
}