class Solution {
    public void reverseString(char[] s) {
        char[] c = new char[s.length];
        for(int i =0;i<s.length;i++){
            c[i] = s[s.length-1-i];
        }
        for(int i = 0;i<s.length;i++){
            s[i] = c[i];
        }
        System.out.println(s);
         
    }
}