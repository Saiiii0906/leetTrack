class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();

        recurse(nums,k,n,0,0,newList, ans);
        return ans;
    }

    public static void recurse(int[] nums, int k, int n, int idx, int sum, List<Integer> newList, List<List<Integer>> ans){
        if(newList.size()==k){
            if(sum==n) ans.add(new ArrayList<>(newList));
            return;
        }

        for(int i=idx; i<nums.length; i++){
            if(sum+nums[i]>n) break;
            newList.add(nums[i]);
            recurse(nums, k, n, i+1, sum+nums[i], newList, ans);
            newList.remove(newList.size()-1);
        }
    }
}