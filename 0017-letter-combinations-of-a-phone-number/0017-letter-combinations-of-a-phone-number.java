class Solution {
    private Map<Character, String> digitToLetters = new HashMap<>();
    private List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0)
            return res;

        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        combinations(digits, 0, new StringBuilder());
        return res;
    }

    public void combinations(String digits, int currIdx, StringBuilder currCombi) {
        if (currIdx == digits.length()) {
            res.add(currCombi.toString());
            return;
        }

        char currDigit = digits.charAt(currIdx);
        String letters = digitToLetters.get(currDigit);

        if (letters != null) {
            for (int i = 0; i < letters.length(); i++) {
                char letter = letters.charAt(i);
                currCombi.append(letter);
                combinations(digits, currIdx + 1, currCombi);
                currCombi.deleteCharAt(currCombi.length() - 1);
            }
        }
    }
}