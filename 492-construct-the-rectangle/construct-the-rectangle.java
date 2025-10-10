class Solution {
    public int[] constructRectangle(int area) {
int num[]=new int [2];
        int min=(int)Math.sqrt(area);
        while(min>=1){
            if(area%min==0) break;
            min--;
        }
        int l=area/min;
num[0]=l;
num[1]=min;
return num;
    }
}