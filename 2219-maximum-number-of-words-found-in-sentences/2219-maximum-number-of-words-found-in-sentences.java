class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0;i<sentences.length;i++){
            String arr[] = sentences[i].split(" ");
            int len = arr.length;
            if(len > max){
                max = len;
                len = 0;
            }
        }
        return max;
    }
}