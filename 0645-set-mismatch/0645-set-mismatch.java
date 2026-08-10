class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] count = new int[n+1];
        int dup=-1;
        int miss=-1;

        for(int i:nums){
            count[i]++;
        }
        
        for(int i=1; i<=n; i++){
            if(count[i]==2){
                dup=i;
            }else if(count[i]==0){
                miss=i;
            }
        }

        return new int[]{dup, miss};
    }
}