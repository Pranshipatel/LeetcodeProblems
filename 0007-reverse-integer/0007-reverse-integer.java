class Solution {
    public int reverse(int n) {
         int copy = n;
          if(n == 0)return 0 ;
          int rev = 0;
          while(n != 0){
              int rem = n %10;
              if(rev > Integer.MAX_VALUE / 10)return 0;
              if(rev < Integer.MIN_VALUE/10)return 0;
              rev = rev * 10 + rem;
              n = n/10;
          }
          return rev;
    }
}