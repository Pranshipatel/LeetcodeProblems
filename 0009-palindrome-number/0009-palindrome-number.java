class Solution {
    public boolean isPalindrome(int x) {
       int rev = 0;
       int copy = x;
       while(x > 0){
        int rem = x % 10 ;
        rev = rev*10 + rem;
        x = x/10;
       }

       if(rev == copy)return true;
       return false;
    }
}