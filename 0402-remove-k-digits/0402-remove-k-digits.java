class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        for (char digit : num.toCharArray()) {
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > digit) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(digit);
        }

        while (k > 0 && sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
            k--;
        }

        int nonZeroIdx = 0;
        while (nonZeroIdx < sb.length() && sb.charAt(nonZeroIdx) == '0') {
            nonZeroIdx++;
        }

        String result = sb.substring(nonZeroIdx);
        return result.isEmpty() ? "0" : result;
    }
}