class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3)return false;
        int peak = 0;
        for(int i=1;i<arr.length-1;i++){
            int prev = arr[i-1];
            int curr= arr[i];
            int next = arr[i+1];
            if(prev == curr || curr == next)return false;
            if(prev > curr && curr < next)return false;
            if(prev < curr && curr > next){
                peak++;
                if(peak > 1)return false;
            }
        }
        return peak == 1;
    }
}