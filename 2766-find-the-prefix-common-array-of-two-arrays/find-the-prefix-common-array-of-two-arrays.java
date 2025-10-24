class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        Map<Integer,Integer>map=new HashMap<>();
        int count=0;
        int C[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
             map.put(B[i],map.getOrDefault(B[i],0)+1);
             if(A[i]==B[i]){
                count+=1;
                C[i]=count;
             }else{
              if(map.get(A[i])==2) count+=1;
              if(map.get(B[i])==2) count+=1;
              C[i]=count;
             }
        }
        return C;
    }
}