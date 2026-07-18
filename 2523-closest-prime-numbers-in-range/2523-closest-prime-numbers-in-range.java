class Solution {
    public int[] closestPrimes(int left, int right) {
        if(left>right) return new int[]{-1,-1};

        boolean[] isPrime = new boolean[right+1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1]= false;
        for(int i=2; i*i<= right; i++){
            if(isPrime[i]){
                for(int j=i*i; j<=right; j+=i){
                    isPrime[j] = false;
                }
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for(int i=left; i<= right; i++){
            if(isPrime[i]) res.add(i);
        }

        if(res.size() < 2) return new int[]{-1, -1};

        int minDiff = Integer.MAX_VALUE;
        int num1=-1, num2=-1;
        for(int i=1; i<res.size(); i++){
            int diff = res.get(i) - res.get(i-1);
            if(diff<minDiff){
                minDiff =diff;
                num1=res.get(i-1);
                num2=res.get(i);
            }
        }

        return new int[]{num1, num2};
    }
}