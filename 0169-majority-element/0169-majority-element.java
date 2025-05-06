class Solution {
    public int majorityElement(int[] nums) {
      int c =0;
      int ans = nums[0];
      for(int i=0;i<nums.length;i++){
        if(nums[i] == ans)c++;
        else c--;
        if(c ==0){
            ans = nums[i];
            c=1;
        }
      }
      return ans;
    }
}