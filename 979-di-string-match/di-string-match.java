class Solution {
    public int[] diStringMatch(String s) {
        int left=0,right=s.length();
        int arr[]=new int[s.length()+1];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='I') {
                arr[i]=left;
                left++;
            }else{
                arr[i]=right;
                right--;
            }
        }
       arr[s.length()]= s.charAt(s.length()-1)=='I'?left:right;
        return arr;
    }
}