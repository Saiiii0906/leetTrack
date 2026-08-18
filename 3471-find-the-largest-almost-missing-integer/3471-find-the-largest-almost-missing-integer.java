class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;

        HashMap<Integer, Integer> res = new HashMap<>();

        for(int i=0; i<=n-k; i++){
            Set<Integer> temp = new HashSet<>();
            for(int j=i; j<i+k; j++){
                temp.add(nums[j]);
            }

            for(int t : temp){
                res.put(t, res.getOrDefault(t, 0)+1);
            }
        }

        int maxi=-1;
        
        for(Map.Entry<Integer, Integer> ent : res.entrySet()){
            if(ent.getValue() == 1){
                maxi = Math.max(maxi, ent.getKey());
            }
        }
        return maxi;
    }
}