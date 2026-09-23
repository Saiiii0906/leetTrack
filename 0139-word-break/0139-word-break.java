class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict);
        Boolean[] memo = new Boolean[s.length()];
        return wordbreak(0, s, dict, memo);
    }

    private boolean wordbreak(int p, String s, Set<String> dict, Boolean[] memo) {
        if (p == s.length())
            return true;

        if (memo[p] != null)
            return memo[p];

        for (int i = p + 1; i <= s.length(); i++) {
            if (dict.contains(s.substring(p, i)) && wordbreak(i, s, dict, memo)) {
                return memo[p] = true;
            }
        }
        return memo[p] = false;
    }
}