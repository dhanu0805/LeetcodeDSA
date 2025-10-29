class Solution {
    public int smallestNumber(int n) {
        int res=0;
         for(int i=1;;i++){
          res=(int)  Math.pow(2,i)-1;
            if(res>=n)break;
         }
         return res;
    }
}