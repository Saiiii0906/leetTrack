class Solution {
    int MAX = 100005;
    int[] tree = new int[MAX];

    private void update(int idx, int val) {
        while (idx < MAX) {
            tree[idx] += val;
            idx += idx & (-idx);
        }
    }

    private int query(int idx) {
        int sum = 0;
        while (idx > 0) {
            sum += tree[idx];
            idx -= idx & (-idx);
        }
        return sum;
    }

    public int createSortedArray(int[] instructions){
        int MOD = 1000000007;
        long ans = 0;
        int n = instructions.length;
        
        for (int i = 0; i < n; i++) {
            int x = instructions[i];
            int less = query(x - 1);
            int greater = i - query(x);
            
            ans = (ans + Math.min(less, greater)) % MOD;
            update(x, 1);
        }
        
        return (int) ans;
    }
}