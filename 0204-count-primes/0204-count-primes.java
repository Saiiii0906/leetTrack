class Solution {
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        int cnt =0;
        for(int i=2; i<n; i++){
            isPrime[i]=true;
        }

        for(int i=2; i<n; i++){
            if(isPrime[i]){
                cnt++;
                for(int j=i*2; j<n; j+=i){
                    isPrime[j]=false;
                }
            }
            
        }return cnt;
    }
}