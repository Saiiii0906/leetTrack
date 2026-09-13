class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        recursive(nums, subset, res, 0);
        return res;
    }

    public void recursive(int[] nums, List<Integer> subset, List<List<Integer>> res, int idx){
        res.add(new ArrayList<>(subset));
        for(int i=idx; i<nums.length; i++){
            subset.add(nums[i]);
            recursive(nums, subset, res, i+1);
            subset.remove(subset.size()-1);
        }
    }
}