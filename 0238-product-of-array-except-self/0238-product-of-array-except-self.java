class Solution {
    public int[] productExceptSelf(int[] nums) {
       int res = 1;
       int arr[] = new int[nums.length];
       for(int i=0;i<nums.length;i++){
        arr[i] = res;
        res = nums[i]*res;
       }
       res = 1;
       for(int i=nums.length-1;i>=0;i--){
        arr[i]= arr[i]*res;
        res = nums[i]*res;
       }
       return arr;
    }
}