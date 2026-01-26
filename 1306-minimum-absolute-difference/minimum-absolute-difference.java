class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++){
            min=Math.min(min,arr[i+1]-arr[i]);
        }
        for(int i=0;i<arr.length-1;i++){
            int a=arr[i];
            int b=arr[i+1];
            if(b-a==min){
                List<Integer>ans=new ArrayList<>();
                ans.add(a);
                ans.add(b);
                list.add(ans);
            }
        }
        return list;
    }
}