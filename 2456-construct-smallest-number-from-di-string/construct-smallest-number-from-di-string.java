class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length();
        int arr[]=new int[n+1];
        for(int i=1;i<=n+1;i++){
            arr[i-1]=i;
        }
          
          for(int i = 0; i < n; i++){
            int temp = i;
            while(temp < n && pattern.charAt(temp) == 'D') temp++;
            
            if(temp > i) {       
                reverse(arr, i, temp);
                i = temp - 1;
            }
        }
      StringBuilder str = new StringBuilder();
        for(int x : arr) str.append(x);
        return str.toString();
    }
  public void reverse(int arr[], int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}