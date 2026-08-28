class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();

        if(p.length()>s.length()) return ans;
        int[] freq = new int[26];
        int[] win= new int[26];

        for(char c:p.toCharArray()){
            freq[c-'a']++;
        }

        int k=p.length();

        for(int i=0; i<k; i++){
            win[s.charAt(i)-'a']++;
        }

        if(Arrays.equals(freq, win)){
            ans.add(0);
        }

        for(int i=k; i<s.length(); i++){
            win[s.charAt(i)-'a']++;
            win[s.charAt(i-k)-'a']--;

            if(Arrays.equals(freq, win)){
                ans.add(i-k+1);
            }
        }

        return ans;
    }
}