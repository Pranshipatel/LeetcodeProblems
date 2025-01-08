class Solution {
    public int trap(int[] height) {
        
         int max = 0;
        int maxRight =0;
        int sum =0;
        int left[] = new int[height.length];
        int right[] = new int[height.length];

        for(int i=0;i< height.length;i++){
            if(height[i] > max){
                max = height[i];
            }
            left[i] = max;
        }

        for(int i = height.length-1;i>=0;i--){
            if(height[i] > maxRight){
                maxRight = height[i];
            }
            right[i] = maxRight;
        }

        for(int i=0;i<height.length;i++){
            sum += Math.min(left[i] , right[i]) - height[i] ;
        }
        return sum;
    }
}