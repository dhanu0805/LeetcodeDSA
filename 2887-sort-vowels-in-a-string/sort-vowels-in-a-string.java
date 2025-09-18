class Solution {
    public String sortVowels(String s) {
        List<Character>list=new ArrayList<>();
        String str="aeiouAEIOU";
        for(char ch:s.toCharArray()){
             if(str.indexOf(ch)!=-1){
                list.add(ch);
             }
        }
        Collections.sort(list);
        StringBuilder string=new StringBuilder();
        int ind=0;
        for(char ch:s.toCharArray()){
            if(str.indexOf(ch)!=-1){
                string.append(list.get(ind++));
            }else{
                string.append(ch);
            }
        }
        return string.toString();
    }
}