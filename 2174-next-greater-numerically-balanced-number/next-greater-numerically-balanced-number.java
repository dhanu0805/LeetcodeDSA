class Solution {
    public int nextBeautifulNumber(int n) {
        int num=n+1;
        while(true){
            if(isBalanced(num)){
                return num;
            }
            num++;
        }
    }
    boolean isBalanced(int n){
        int arr[]=new int[10];
        int x=n;
        while(n>0){
            int d=n%10;
            arr[d]++;
            n=n/10;
        }
  while(x>0){
    int d=x%10;
    if(arr[d]!=d) return false;
    x=x/10;
  }
  return true;
    }
}