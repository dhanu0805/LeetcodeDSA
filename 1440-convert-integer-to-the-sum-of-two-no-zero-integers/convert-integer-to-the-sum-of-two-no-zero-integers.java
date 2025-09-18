class Solution {
    boolean fun(int num){
            while(num>0){
                if(num%10==0) return true;
                num=num/10;
            }
            return false;
        }
    public int[] getNoZeroIntegers(int n) {
        int arr[]=new int[2];
        for(int a=1;a<n;a++){
            int b=n-a;
            if(!fun(a) && !fun(b)){
                arr[0]=a;
                arr[1]=b;
                return arr;
            }
        }
        arr[0]=0;
        return arr;
    }
}