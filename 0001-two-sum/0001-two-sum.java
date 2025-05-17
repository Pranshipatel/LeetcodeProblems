class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int reqNo = target - nums[i];
        if(map.containsKey(reqNo)){
            int arr[] = {map.get(reqNo),i};
            return arr;
        }
        map.put(nums[i],i);
       }
       return null;
    }
}