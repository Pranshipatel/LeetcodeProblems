class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];
         return GCD(a,b);
    }
    public int GCD(int a, int b){
        if(b == 0)return a;
        else return GCD(b, a%b);
    }
}