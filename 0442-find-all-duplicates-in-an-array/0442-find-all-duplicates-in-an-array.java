class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       HashMap<Integer,Integer> map = new HashMap<>();
       for(int a : nums){
           map.put(a,map.getOrDefault(a,0)+1);
       }
        System.out.println(map);
       List<Integer> list = new ArrayList<>();
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue() >= 2){
               list.add(entry.getKey());
           }
       }
       return list;
    }
}