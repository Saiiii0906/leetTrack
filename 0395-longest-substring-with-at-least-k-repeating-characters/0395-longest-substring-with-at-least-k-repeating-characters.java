class Solution {
    public int longestSubstring(String s, int k) {
        int n=s.length();
        if(s.isEmpty() || s.length()<k) return 0;

        int[] freq = new int[26];
        for(char c: s.toCharArray()){
            freq[c-'a']++;
        }

        int max=0;
        for(int i=0; i<n; i++){
            if(freq[s.charAt(i)-'a']<k){
                int l=longestSubstring(s.substring(0,i),k);
                int r=longestSubstring(s.substring(i+1),k);
                return Math.max(l,r);
            }
        }

        return n;
    }
}