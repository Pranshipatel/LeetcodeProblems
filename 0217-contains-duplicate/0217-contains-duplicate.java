class Solution {
    public boolean containsDuplicate(int[] nums) {
          HashMap<Integer ,Integer> map = new HashMap<>();
          for(int key : nums){
            map.put(key, map.getOrDefault(key,0)+1);
          }

          for(int result : map.keySet()){
            if(map.get(result)>1){
                return true;
            }
          }
          return false;
    }
}