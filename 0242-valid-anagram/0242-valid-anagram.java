class Solution {
    public boolean isAnagram(String s, String t) {
    if(s.length() != t.length())return false;
      HashMap<Character,Integer> map1 = new HashMap<>();

      for(int i = 0;i<s.length();i++){
          char ch = s.charAt(i);
          map1.put(ch,map1.getOrDefault(ch,0)+1);
      }
      for(int i = 0;i<t.length();i++){
          char ch = t.charAt(i);

          if(!map1.containsKey(ch)){
            return false;
          }
          map1.put(ch,map1.get(ch)-1);
          if(map1.get(ch) == 0){
              map1.remove(ch);
          }
      }
     return map1.isEmpty();
    }
}