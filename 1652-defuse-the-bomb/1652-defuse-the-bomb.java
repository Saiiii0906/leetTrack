class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] res = new int[n];
        if (k == 0)
            return res;

        int sum = 0;

        int st = 1, end = k;
        if (k < 0) {
            k = -k;
            st = n - k;
            end = n - 1;
        }

        for (int i = st; i <= end; i++) {
            sum += code[i];
        }

        for (int i = 0; i < n; i++) {
            res[i] = sum;
            sum -= code[(st + i) % n];
            sum += code[(end + i + 1) % n];
        }

        return res;
    }
}