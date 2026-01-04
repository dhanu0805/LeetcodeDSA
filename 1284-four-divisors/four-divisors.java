class Solution {
    public int sumFourDivisors(int[] nums) {
        int final1=0;
        for(int num:nums){
            int sum=1+num;
            int c=0;
            for(int i=2;i<=Math.sqrt(num);i++){
                  if(num%i==0){
                    int other=num/i;
                    if(i==other){
                         c+=1;
                        sum+=i;
                    }else {
                        c=c+2;
                        sum=sum+i+other;
                    }
                  }
            }
            if(c==2) final1+=sum;
        }
        return final1;
    }
}