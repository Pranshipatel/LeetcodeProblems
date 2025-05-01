class Solution {
    public int addDigits(int num) {
        if(num == 0)return 0;
        if (num <= 9 && num > 0)return num;
        int sum = 0;
        while(num !=0){
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
       
        while(sum > 9){
            int ans = sum;
            sum = 0;
            while(ans !=0){
                int rem = ans % 10;
                sum += rem;
                ans /= 10;
            }
        }
        return sum;
    }
}