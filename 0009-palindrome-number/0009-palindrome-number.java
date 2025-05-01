class Solution {
    public boolean isPalindrome(int x) {
        int copy = x;
        if(x < 0)return false;
        else if (x == 0)return true;
        int rev = 0;
        while(x!=0){
            int rem = x %10;
            rev = rev * 10 + rem;
            x = x/10;
        }
        return copy == rev ? true: false;
    }
}