class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int arr[]=new int[2];
       int ind=0;
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                arr[ind++]=nums[i];
            }else{
                map.put(nums[i],1);
            }
        }
        return arr;
    }
}