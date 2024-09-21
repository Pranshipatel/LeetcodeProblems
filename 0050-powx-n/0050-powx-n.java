class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1.0;
        }
        if(x == 0){
            return 0.0;
        }
        if(x == -1 && n%2 == 0)return 1.0;
        if(x == -1 && n%2 != 0)return -1.0;

        if(n< 0){
            if(n == Integer.MIN_VALUE){
                return 1 / (x * myPow(x , -(n/2)) *  myPow(x , -(n/2)));
            }
            x = 1/x;
            n = -n;
        }
        return PowHelper(x,(long)n);
    }
    private  double PowHelper(double x ,long n){
        if(n ==  0){
            return 1.0;
        }
        if(n % 2 == 0){
            double half = PowHelper(x , n / 2);
            return half * half;
        }
        else{
            return PowHelper(x, n-1) * x; 
        }
    }
}