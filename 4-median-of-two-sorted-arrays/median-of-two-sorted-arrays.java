class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer>list=Stream.concat(Arrays.stream(nums1).boxed(), Arrays.stream(nums2).boxed())
                                   .sorted()
                                   .collect(Collectors.toList());
                                   double res1=0.0;
        if(list.size()%2!=0){
              double res=(double)list.get(list.size()/2);
              return res;
        }else{
        int i= list.size()/2;
        int fir=list.get(i);
        int sec=list.get(i-1);
         res1=(fir+sec)/2.0;
        }
        return res1;
    }
}