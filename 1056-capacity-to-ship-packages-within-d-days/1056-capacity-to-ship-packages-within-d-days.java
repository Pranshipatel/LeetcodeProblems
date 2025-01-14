class Solution {
   public int shipWithinDays(int[] weights, int days) {
        int start = 0 , end = 0;
        for(int weight : weights){
            end += weight;
            start = Math.max(start,weight);
        }
        while (start< end){
            int mid = start + (end-start)/2;
            int day = Day(weights,mid);
            if(day > days)start = mid + 1;
            else end= mid;
        }
        return start;
    }
    public static int Day(int weights[], int mid){
        int day = 1 ;
        int sum = 0;
        for(int weight: weights){
            if(sum + weight > mid){
                day++;
                sum = 0;
            }
            sum += weight;
        }
        return day;
    }
}