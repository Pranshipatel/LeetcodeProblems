class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
        }
        int actualSum = (n * (n+1))/2;
        int missno = actualSum - sum;
        return missno;
    }
   
}