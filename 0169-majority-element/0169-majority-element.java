class Solution {
    public int majorityElement(int[] nums) {
     HashMap<Integer , Integer> map = new HashMap<>();
     int majority = nums.length/2;
     int key = 0;
     for(int num: nums){
        map.put(num,map.getOrDefault(num,0)+1);
     }
     for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        if(entry.getValue() > majority){
            key = entry.getKey();
        }
     }
     return key;
    }
}