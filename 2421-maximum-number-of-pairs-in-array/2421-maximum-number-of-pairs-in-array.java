class Solution {
    public int[] numberOfPairs(int[] nums) {
        Arrays.sort(nums);
        int c =0;
        int arr[] = new int[2];
        for(int i=0;i<nums.length-1;){
            if(nums[i] == nums[i+1]){
              c++;
              i+=2;
            }
            else{
                i++;
            }
        }
        arr[0] = c;
        arr[1] = nums.length - 2*c;
        return arr;
    }
}