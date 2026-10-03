class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        List<Integer> sort = new ArrayList<>();

        for(int i=nums.length-1; i>=0; i--){
            int idx = insert(sort, nums[i]);
            res.add(idx);
            sort.add(idx, nums[i]);
        }

        Collections.reverse(res);
        return res;
    }

    private int insert(List<Integer> arr, int num){
        int l=0; int r = arr.size()-1;

        while(l<=r){
            int mid = l+(r-l)/2;
            if(arr.get(mid)<num){
                l=mid+1;
            }else{
                r=mid-1;
            }
        }

        return l;
    }
}