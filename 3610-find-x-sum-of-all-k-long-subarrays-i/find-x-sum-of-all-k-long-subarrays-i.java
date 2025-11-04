class Solution {
    public int[] findXSum(int[] nums, int k, int x){
        int len=nums.length;
       int arr[]=new int[len-k+1];
       for(int i=0;i<=len-k;i++){
  arr[i]=sum(nums, k,i,x);
       } 
       return arr;
    }
    int sum(int arr[],int k,int st,int x){
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int i=st;i<st+k;i++){
map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        List<Map.Entry<Integer,Integer>>list=new ArrayList<>(map.entrySet());
        Collections.sort(list,(a,b)->
      {
        if(a.getValue()!=b.getValue())
         return  b.getValue()-a.getValue();
          return  b.getKey()-a.getKey();
      }
        
        );
        int sta=x;
        int sum=0;
        for(Map.Entry<Integer,Integer>l:list){
            if(sta==0) break;
            int t=l.getValue();
            sum+=l.getKey()*l.getValue();
            sta--;

        }
        return sum;
    }
}