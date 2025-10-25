class Solution {
    public int totalMoney(int n) {
        int num=1;
        int sum=0;
        while(n>7){
            for(int i=num;i<num+7;i++){
sum+=i;
            }
            num++;
            n=n-7;
        }
        for(int i=num;i<num+n;i++){
            sum+=i;
        }
        return sum;
    }
}