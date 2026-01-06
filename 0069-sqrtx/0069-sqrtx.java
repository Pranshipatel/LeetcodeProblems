class Solution {
    public int mySqrt(int x) {
        long sqrt = 0;
        for(long i = 1 ; i*i <= x ; i++){
            if(i*i <= x){
                sqrt = i;
            }
        }
        return (int)sqrt;
    }
}