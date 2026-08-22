class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int count=0;
        for(int i=0; i<k; i++){
            char ch= s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u') count++;
        }

        int maxCount = count;
        for(int i=1; i<=n-k; i++){
            char ch = s.charAt(i-1);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u') count--;

            ch = s.charAt(i+k-1);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u') count++;

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;


    }
}