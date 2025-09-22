class Solution {
    public int canBeTypedWords(String text, String broken) {
        Map<Character,Integer>map=new HashMap<>();
        for(char ch:broken.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int c=0;
        String arr[]=text.split(" ");
        for(String str:arr){
            int cnt=0;
            for(char ch:str.toCharArray()){
                if(map.containsKey(ch))break;
                else cnt++;
            }
            if(cnt==str.length()) c++;
        }
        return c;
    }
}