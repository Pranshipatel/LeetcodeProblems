class Solution {
    public boolean check(int[] nums) {
        int pivot = 0;
        boolean is = true;
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                pivot = i;
                is = false;
                break;
            }
        }
        if(is){
            return true;
        }
        int rotation = n - pivot;
        int rotated[] = new int[n];
        for(int i= 0;i<n;i++){
            rotated[(i+rotation)%n] = nums[i]; 
        }
      
        for(int i=1;i<n;i++){
            if(rotated[i]<rotated[i-1]){
                return false;
            }
        }
        return true;

    }
}