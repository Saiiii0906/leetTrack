class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return most(nums, k) - most(nums, k-1);
    }

    public int most(int[] nums, int k){
        int count=0, i=0;
        Map<Integer, Integer> res = new HashMap<>();
        for(int j=0; j<nums.length; ++j){
            if(res.getOrDefault(nums[j],0)==0) k--;
            res.put(nums[j], res.getOrDefault(nums[j],0)+1);
            while(k<0){
                res.put(nums[i], res.get(nums[i])-1);
                if(res.get(nums[i])==0) k++;
                i++;
            }
            count += j-i+1;
        }
        return count;
    }
}