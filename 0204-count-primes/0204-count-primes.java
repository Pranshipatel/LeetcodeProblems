class Solution {
    public int countPrimes(int n) {
        if(n <= 2)return 0;
       boolean prime[] = new boolean[n+1];
       int c  = 0;
       Arrays.fill(prime, true);
       prime[0] = prime[1] = false;
       for(int i=2;i*i < n;i++){
        if(prime[i]){
            for(int j = i*i; j<=n ; j = j+i){
              prime[j] = false;
            }
        }
       }
       for(int i=0;i<n;i++){
        if(prime[i]){
            c++;
        }
       }
       return c;
    }
    
   
}