class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int[] freq = new int[128];
        int l=0, max =0;

        for(int r=0; r<n; r++){
            char ch = s.charAt(r);
            while(freq[ch]>0){
                freq[s.charAt(l)]--;
                l++;
            }
            freq[ch]++;
            max = Math.max(max, r-l+1);
        }
        return max;
    }
}