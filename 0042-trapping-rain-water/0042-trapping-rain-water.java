class Solution {
    public int trap(int[] height) {
         int leftMax = Integer.MIN_VALUE;
       int rightMax = Integer.MIN_VALUE;
       int left[] = new int[height.length];
       int right[] = new int[height.length];
       int trap =0;
       for(int i=0;i<height.length;i++){
           if(height[i]>leftMax) leftMax = height[i];
           left[i]= leftMax;
       }
        for(int i=height.length-1;i>=0;i--){
            if(height[i]>rightMax) rightMax = height[i];
            right[i]= rightMax;
        }
        int sum =0;
        for(int i=0;i<height.length;i++){
            sum += Math.min(left[i],right[i])- height[i];
        }
        return sum;
    }
}