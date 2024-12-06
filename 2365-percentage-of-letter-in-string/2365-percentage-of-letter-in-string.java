class Solution {
    public int percentageLetter(String s, char letter) {
        HashMap<Character , Integer> map = new HashMap<>();
        int size = s.length();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        if(map.containsKey(letter)){
            int value = map.get(letter);
            return (int) ((value/(double)size)*100);
        }
        return 0;
    }
}