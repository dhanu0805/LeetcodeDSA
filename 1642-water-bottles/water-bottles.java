class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int empty=numBottles;
        int total=numBottles;
        while(empty>=numExchange){
            total+=empty/numExchange;
            empty=empty/numExchange+(empty%numExchange);
        }
        return total;
    }
}