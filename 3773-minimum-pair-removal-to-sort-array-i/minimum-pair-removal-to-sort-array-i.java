class Solution {
    public boolean isSorted(List<Integer> arr){
        int n=arr.size();
        for(int i=0;i<n-1;i++){
            if(arr.get(i+1)<arr.get(i)) return false;
        }
        return true;
    }
    public int minimumPairRemoval(int[] nums) {
        List<Integer>list=new ArrayList<>();
        for(int num:nums) list.add(num);
        int res=0;
        while(!isSorted(list)){
            int min=Integer.MAX_VALUE;
            int ind=-1;
            for(int i=0;i<list.size()-1;i++){
                int sum=list.get(i)+list.get(i+1);
                if(sum<min){
                    min=sum;
                    ind=i;
                }
            }
            list.set(ind,min);
            list.remove(ind+1);
            res++;
        }
        return res;
    }
}