class Solution {
    public int divisorSubstrings(int num, int k) {
        String s = String.valueOf(num);
        int count = 0;
        for (int i = 0; i <= s.length() - k; i++) {
            String r = s.substring(i, i + k);
            int n = Integer.parseInt(r);

            if (n != 0 && num % n == 0) {
                count++;
            }
        }
        return count;
    }
}