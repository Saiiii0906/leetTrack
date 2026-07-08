class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int frq=0;
        int res=0;
        for(int i=0; i<n; i++){
            if(frq ==0){
                res = nums[i];
            }

            if(res == nums[i]){
                frq++;
            }else{
                frq--;
            }
        }
        return res;
    }
}