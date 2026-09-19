class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        makeCombination(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    public void makeCombination(int[] candidates, int target, int st, List<Integer> comb, List<List<Integer>> res){
        if(target<0) return;

        if(target==0){
            res.add(new ArrayList<Integer>(comb));
            return;
        }

        for(int i=st; i<candidates.length; i++){
            if(i>st && candidates[i]==candidates[i-1]){
                continue;
            }

            if(candidates[i]>target) break;

            comb.add(candidates[i]);
            makeCombination(candidates, target-candidates[i], i+1, comb, res);
            comb.remove(comb.size()-1);
        }
    }
}