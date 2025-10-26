class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[]=new int[num_people];
        Arrays.fill(arr,0);
        int n=1;
        while(candies!=0){
  for(int i=0;i<num_people;i++){
    if(candies>=n){
        arr[i]+=n;
    }else{
        arr[i]+=candies;
        candies=0;
        break;
    }
    candies-=n;
    n++;
  }
        }
        return arr;
    }
}