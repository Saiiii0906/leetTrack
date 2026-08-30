class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0, r;
        HashMap<Integer, Integer> res = new HashMap<>();
        int maxLen = 0;

        for (r = 0; r < fruits.length; r++) {
            res.put(fruits[r], res.getOrDefault(fruits[r], 0) + 1);
            while (res.size() > 2) {
                int leftFruit = fruits[l];
                res.put(leftFruit, res.get(leftFruit) - 1);
                if (res.get(leftFruit) == 0) {
                    res.remove(leftFruit);
                }
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }

        return maxLen;
    }
}