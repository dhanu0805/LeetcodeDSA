class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int arr[]=new int[map.size()];
        int ind=0;
        for(int val:map.values()){
            arr[ind++]=val;
        }
        Arrays.sort(arr);
        int res=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]==arr[i+1]) res=res+arr[i];
            else break;
        }
        return res;
    }
}