class Solution {
    public int removeDuplicates(int[] nums) {
       int c = 0;
       for(int i = 0;i<nums.length-1;i++){
        if(nums[i]== nums[i+1])continue;
        else{
            nums[c++] = nums[i];
        }
       }
       nums[c++] = nums[nums.length-1];
       return c;
    }
}