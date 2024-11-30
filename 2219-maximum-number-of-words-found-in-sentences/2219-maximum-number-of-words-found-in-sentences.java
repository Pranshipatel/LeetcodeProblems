class Solution {
    public int mostWordsFound(String[] sentences) {
      int max = 0;
        for(String key : sentences){
            int wordsCount = key.split(" ").length;
            max = Math.max(max,wordsCount);
        }
        return max;
    }
}