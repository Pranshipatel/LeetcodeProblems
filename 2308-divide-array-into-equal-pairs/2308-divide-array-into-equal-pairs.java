class Solution {
    public boolean divideArray(int[] nums) {
        if(nums.length % 2 != 0)return false;
         HashMap<Integer, Integer> map = new HashMap<>();
        for(int key : nums){
            map.put(key, map.getOrDefault(key,0)+1);
        }
        for(int key : map.keySet()){
            if(map.get(key) % 2 != 0){
                return false;
            }
        }
        return true;
    }
}