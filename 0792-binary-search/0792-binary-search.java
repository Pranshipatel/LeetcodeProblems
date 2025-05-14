class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int ans = binary(nums,start, end, target);
        return ans;
    }
    public int binary(int arr[], int s, int e, int k){
        if(s <= e){
            int mid = s + (e - s)/2;
            if(arr[mid] == k)return mid;
            else if(arr[mid] < k){
                return binary(arr, mid+1, e, k);
            }
            else{
                 return binary(arr, s, mid-1,k);
            }
        }
        return -1;
    }
}