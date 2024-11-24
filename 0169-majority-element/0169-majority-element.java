class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int key : nums){
                map.put(key, map.getOrDefault(key,0)+1);
        }

        for(int key: map.keySet()){
            if(map.get(key) > n/2){
                return key;
            }
        }
        return -1;
    }
}