class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftBound = leftRound(nums,target);

        int rightBound = rightRound(nums,target);
        
        return new int []{leftBound,rightBound} ;
    }
    public int leftRound(int arr[],int k){
        int s = 0;
        int e = arr.length-1;
        int index = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == k){
                index = mid;
                e = mid -1;
            }
            else if(arr[mid] < k)s = mid+1;
            else e = mid-1;
        }
        return index;
    }
    public int rightRound(int arr[],int k){
        int s = 0;
        int e = arr.length-1;
        int index = -1;
        while(s <= e){
            int mid = s + (e-s)/2;
            if(arr[mid] == k){
                index = mid;
                s = mid + 1;
            }
            else if(arr[mid] < k)s = mid+1;
            else e = mid-1;
        }
        return index;
    }
}