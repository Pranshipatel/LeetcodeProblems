class Solution {
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        divide(nums, 0, n-1);
        return nums;
    }
    public void divide(int arr[] ,int si , int ei){
        if (si>= ei)return;
        int mid = si + (ei - si)/2;

        divide(arr , si ,mid);
        divide(arr, mid+1,ei);
        conquer(arr, si, mid, ei);
    }
    public void conquer(int arr[], int si,int mid, int ei){
        int merged[] = new int[ei - si +1];
        int i= si;
        int j = mid+1;
        int k = 0;
        while(i<= mid && j<= ei){
            if(arr[i] <arr[j])merged[k++] = arr[i++];
            else merged[k++] = arr[j++];
        }
        while(i<= mid){
            merged[k++] = arr[i++];
        }
        while(j<= ei){
            merged[k++] = arr[j++];
        }
        for(int a = 0, b= si;a<merged.length;a++,b++){
            arr[b] = merged[a];
        }
    }
}