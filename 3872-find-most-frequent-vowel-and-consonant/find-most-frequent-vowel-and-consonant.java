class Solution {
    public int maxFreqSum(String s) {
        int max1=0;
        int max2=0;
        Map<Character,Integer>map=new HashMap<>();
        map.put('a',0);
        map.put('e',0);
        map.put('i',0);
        map.put('o',0);
        map.put('u',0);
         Map<Character,Integer>map2=new HashMap<>();
        for(char ch:s.toCharArray()){
  if(map.containsKey(ch)){
    map.put(ch,map.get(ch)+1);
    max1=Math.max(max1,map.get(ch));
  }else{
    map2.put(ch,map2.getOrDefault(ch,0)+1);
    max2=Math.max(max2,map2.get(ch));
  }
        }
        return max1+max2;
        
    }
}