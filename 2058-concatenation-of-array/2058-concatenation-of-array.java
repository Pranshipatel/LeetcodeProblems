class Solution {
    public int[] getConcatenation(int[] nums) {
        int arr[] = new int[2*(nums.length)];
        int mid = arr.length/2;
        for(int i=0;i<nums.length;i++){
            arr[i] = nums[i];
            arr[i+mid] = nums[i];
        }
        return arr;
    }
}