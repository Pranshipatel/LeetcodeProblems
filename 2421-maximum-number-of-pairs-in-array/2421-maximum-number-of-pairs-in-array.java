class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count = 0;
        int remaining = 0;
        int result[] = new int[2];
       HashMap<Integer,Integer> map = new HashMap<>();
        for(int key : nums){
            map.put(key, map.getOrDefault(key,0)+1);
        }

        for(int key : map.keySet()){
            count += map.get(key) / 2 ;
            remaining += map.get(key) % 2;
        }
        result[0] = count++;
        result[1] = remaining;
        return result;
    }
}