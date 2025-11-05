class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int arr[]=new int[friends.length];
        Set<Integer>set=new HashSet<>();
        for(int num:friends) set.add(num);
        int i=0;
        for(int num:order)
        if(set.contains(num))  arr[i++]=num;
        return arr;
    }
}