class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k){
        int len=nums.size();
        int m=k;
        int arr1[]=new int[k];
        int arr2[]=new int[k];
        for(int i=0;i<=len-(2*k);i++){
for(int j=0;j<k;j++){
    arr1[j]=nums.get(j+i);
}
for(int j=0;j<k;j++){
    arr2[j]=nums.get(j+k+i);
}
if(isInc(arr1) && isInc(arr2)) return true;
        }
        return false;
    }
  public  boolean isInc(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]) return false;
        }
        return true;
    }
}