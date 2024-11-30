class Solution {
    public int mostWordsFound(String[] sentences) {
      HashMap<String , Integer> map = new HashMap<>();
        int max  =0;
        int c = 0;
        for(String key : sentences){
            String words[] = key.split(" ");
            System.out.println(Arrays.toString(words));
            for(String count : words){
                c++;
            }
            if(c>max){
                max = c;
            }
            c = 0;
        }
        return max;
    }
}