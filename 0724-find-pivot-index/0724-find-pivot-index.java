class Solution {
    public int pivotIndex(int[] arr) {
         int total = 0;
       for(int i:arr){
           total += i;
       }
       int leftSum =0;
       for(int i=0;i<arr.length;i++){
           leftSum += arr[i];
           if(total-leftSum == leftSum-arr[i]){
               return i;
           }
       }
        return -1;
    }
}