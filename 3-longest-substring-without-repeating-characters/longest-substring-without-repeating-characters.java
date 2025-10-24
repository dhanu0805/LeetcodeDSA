class Solution {
    public int lengthOfLongestSubstring(String s) {
      Map<Character,Integer>map=new HashMap<>();
      int maxLen=0;
      int l=0;
      for(int r=0;r<s.length();r++){
        char c=s.charAt(r);
        if(map.containsKey(c)){
            l=Math.max(l,map.get(c)+1);
        }
          map.put(c,r);
          maxLen=Math.max(maxLen,r-l+1);
      }
      return maxLen;
    }
}