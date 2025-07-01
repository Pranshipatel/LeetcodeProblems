class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashMap<Character , Integer> map = new HashMap<>();
     int maxLength  = 0;
     int left = 0;
     for(int i = 0;i<s.length();i++){
        char current = s.charAt(i);
        if(map.containsKey(current) && map.get(current)>= left){
            left = map.get(current) + 1;
        }
        map.put(current, i);
        maxLength = Math.max(maxLength , i - left + 1);
     }
     return maxLength;
    }
}