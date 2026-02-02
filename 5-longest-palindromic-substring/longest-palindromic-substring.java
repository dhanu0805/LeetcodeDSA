class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        int len=s.length();
         String lps="";
        for(int i=1;i<len;i++){
            int low=i;
            int high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                if(low==-1 || high==len) break;
            }
            String pal=s.substring(low+1,high);
            if(pal.length()>lps.length()){
                lps=pal;
            }


              low=i-1;
             high=i;
            while(s.charAt(low)==s.charAt(high)){
                low--;
                high++;
                if(low==-1 || high==len) break;
            }
             pal=s.substring(low+1,high);
            if(pal.length()>lps.length()){
                lps=pal;
            }
        }
        return lps;
    }
}