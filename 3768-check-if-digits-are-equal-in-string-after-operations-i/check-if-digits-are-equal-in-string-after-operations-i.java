class Solution {
    public boolean hasSameDigits(String s) {
        String temp="";
        while(s.length()!=2){
            for(int i=0;i<s.length()-1;i++){
                int n1=s.charAt(i)-'0';
                int n2=s.charAt(i+1)-'0';
                temp=temp+Integer.toString((n1+n2)%10);
            }
            s=temp;
            temp="";
        }
        if(s.charAt(0)==s.charAt(1)) return true;
        return false;
    }
}